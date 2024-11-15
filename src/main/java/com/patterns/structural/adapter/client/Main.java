package com.patterns.structural.adapter.client;

import com.patterns.structural.adapter.service.AudioPlayer;

public class Main {
    public static void main(String[] args) {
        // The Adapter Design Pattern allows incompatible interfaces to work together by
        // providing a wrapper around an existing class.
        // Here's a practical example in Java involving an adapter for a Media Player
        // application that supports multiple audio formats.
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("vlc", "movie.vlc");
        audioPlayer.play("avi", "unsupported.avi");
    }
}
