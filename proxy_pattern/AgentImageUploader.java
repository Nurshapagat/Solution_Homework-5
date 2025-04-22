package com.example.proxy_pattern;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AgentImageUploader {
    private String agentName;
    private boolean isLoggedIn;

    private static List<String> uploadedImages = new ArrayList<>();

    public AgentImageUploader(String agentName, boolean isLoggedIn) {
        this.agentName = agentName;
        this.isLoggedIn = isLoggedIn;
    }

    public void uploadImage(String filename) {
        if (isLoggedIn) {
            uploadedImages.add(filename);
            System.out.println("Агент " + agentName + " суретті жүктеді: " + filename);

            logUpload(agentName, filename);
        } else {
            System.out.println("Қате: Агент " + agentName + " жүйеге кірмеген. Сурет жүктеуге рұқсат жоқ.");
        }
    }

    private void logUpload(String agentName, String filename) {
        try (FileWriter writer = new FileWriter("upload_logs.txt", true)) {
            writer.write("Agent " + agentName + " uploaded: " + filename + "\n");
        } catch (IOException e) {
            System.out.println("Лог файлға жазу кезінде қате шықты: " + e.getMessage());
        }
    }

    public static void printUploadedImages() {
        System.out.println("Жүктелген барлық суреттер:");
        for (String img : uploadedImages) {
            System.out.println(" - " + img);
        }
    }
}
