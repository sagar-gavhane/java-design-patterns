package com.patterns.structural.adapter.adaptee;

// Adaptee class for VLC player
public class VlcPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
}
