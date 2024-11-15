package com.patterns.structural.adapter.adaptee;

// Adaptee class for MP4 player
public class Mp4Player {
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
