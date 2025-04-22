package com.example.proxy_pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Пайдаланушы интерфейсі ===");
        Image image1 = new ProxyImage("apartment1.jpg");

        image1.displayThumbnail();

        image1.displayFullImage();

        System.out.println("\n=== Агент сурет жүктеуі ===");
        AgentImageUploader agent1 = new AgentImageUploader("Nurshapagat", true);
        agent1.uploadImage("apartment2.jpg");

        AgentImageUploader guest = new AgentImageUploader("GuestUser", false);
        guest.uploadImage("apartment3.jpg");

        AgentImageUploader.printUploadedImages();

    }

}

