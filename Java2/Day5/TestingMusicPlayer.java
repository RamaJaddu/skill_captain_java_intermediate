package com.java2.day5;

public class TestingMusicPlayer {
    public static void main(String[] args) {
        MyMusicPlayer player = new MyMusicPlayer();

        //Adding songs
        player.addSong("Savan Ka mahina");
        player.addSong("Suraj houa mardam");
        player.addSong("Pyar kiyatho darna kya");
        player.addSong("Har badal gayi hai");
        player.addSong("Thum dil ki dadakan");
        player.addSong("Aaj mousam hai bada");

        //Testing play function
        player.play(2);
        player.play(7);

        //Testing stop function
        player.stop();

        //Testing play function
        player.play(4);

        //Testing pause function
        player.pause();

        //Testing remove function
        player.removeSong("Har badal gayi hai");
        player.removeSong("Di diwana");



    }
}
