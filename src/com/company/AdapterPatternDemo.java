package com.company;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "waka-waka.mp3");
        audioPlayer.play("mp4", "cars.mp4");
        audioPlayer.play("vlc", "needForSpeed.vlc");
        audioPlayer.play("avi", "cool.avi");
    }
}