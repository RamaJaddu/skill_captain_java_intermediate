package com.java2.day5;
/*
Assignment: Music Player Interface

Objective: The objective of this assignment is to create a music player application using Java interfaces. The application should support basic music player functionalities such as playing, pausing, and stopping songs. Additionally, it should allow the user to add and remove songs from the playlist.

        Instructions:

        1. Create an interface called `MusicPlayer` with the following methods:
        - `play()`: Abstract method that plays the current song.
- `pause()`: Abstract method that pauses the current song.
- `stop()`: Abstract method that stops the current song.
- `addSong(String song)`: Abstract method that adds a new song to the playlist.
        - `removeSong(String song)`: Abstract method that removes a song from the playlist.

2. Implement the `MusicPlayer` interface in a class called `MyMusicPlayer`. In this class, provide the necessary implementations for all the methods defined in the interface.

        3. In the `Main` class, create an instance of the `MyMusicPlayer` class and perform the following tasks:
        - Add at least five songs to the playlist using the `addSong()` method.
- Play one of the songs using the `play()` method.
- Pause the currently playing song using the `pause()` method.
- Remove a song from the playlist using the `removeSong()` method.
- Stop the currently playing song using the `stop()` method.

4. Test the program by adding, playing, pausing, and stopping songs. Make sure the methods are functioning correctly and producing the expected output.

        5. Optional: Enhance the program by adding additional functionalities such as displaying
        the current playlist or implementing a shuffle feature.

Note: You can use any data structure (e.g., ArrayList, LinkedList) to store the playlist of songs.

Submit your solution as a Java file or a code snippet, along with a brief explanation of your implementation choices and any additional features you have added.

*/


import java.util.LinkedList;
import java.util.List;

public class MyMusicPlayer implements MusicPlayer {

    private final List playlist;
    private boolean isPlaying = false;

    public MyMusicPlayer() {
        this.playlist = new LinkedList<>();
        this.isPlaying = false;
    }

    @Override
    public void play(int list) {
        list = 0;
        if (!playlist.isEmpty()) {
            System.out.println("Record is playing!!!!" + playlist.get(list));
            isPlaying = true;
        } else {
            System.out.println("Playlist is EMPTY.");
        }
    }

    @Override
    public void pause() {
        if (isPlaying) {
            System.out.println("Paused......");
            isPlaying = false;
        } else {
            System.out.println("Currently Songs are not playing....");
        }

    }

    @Override
    public void stop() {
        if (isPlaying) {
            System.out.println("Playing is Stopped.");
            isPlaying = false;
        } else {
            System.out.println("OOPS!!! No song is playing!!!!!");
        }
    }


    @Override
    public void addSong(String song) {
        playlist.add(song);
        System.out.println("Added new song.... " + song);

    }

    @Override
    public void removeSong(String song) {
        if (playlist.contains(song)) {
            playlist.remove(song);
            System.out.println("This song is Removed from playlist.... " + song);
        } else {
            System.out.println("Sorry!!! this song is not found.... " + song);
        }
    }
}



