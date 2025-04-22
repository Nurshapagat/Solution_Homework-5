package com.example.proxy_pattern;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Жоғары сапалы сурет дисктен жүктелді: " + filename);
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Төмен сапалы сурет көрсетілуде: " + filename);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Толық сапалы сурет көрсетілуде: " + filename);
    }
}
