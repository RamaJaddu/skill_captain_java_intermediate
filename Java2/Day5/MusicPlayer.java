package com.java2.day5;

/* 1. Create an interface called `MusicPlayer` with the following methods:
        - `play()`: Abstract method that plays the current song.
- `pause()`: Abstract method that pauses the current song.
- `stop()`: Abstract method that stops the current song.
- `addSong(String song)`: Abstract method that adds a new song to the playlist.
        - `removeSong(String song)`: Abstract method that removes a song from the playlist.

   */
public interface MusicPlayer {
    // Plays current song
    void play(int song);
   //Pause the current song
    void pause();
   //Stops current song
   void stop();
   //Add a new to the playlist
    void addSong(String song);
    //Removes a song from the playlist
    void removeSong(String song);




}
