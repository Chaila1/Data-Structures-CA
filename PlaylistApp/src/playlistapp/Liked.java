/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlistapp;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Matty School
 */
public class Liked implements Interface2 {

    private ArrayList<String> likedSongs;

    /*
        declaring arraylist
     */
    public Liked() {
        likedSongs = new ArrayList<String>();
    }
    /*
        counts the number of songs and returns them as an int
    */
    public int size() {
        return likedSongs.size();

    }
    /*
        checks the array to see if it's full or empty 
    */
    public boolean isEmpty() {
        return likedSongs.isEmpty();
    }

    /*
        removes the item from the top of the stack and returns it
     */
    public Object pop() {
        if (!(likedSongs.isEmpty())) {
            return likedSongs.remove(0);
        } else {
            return null;
        }
    }

    /*
        puts an item onto the top of the stack
     */
    public void push(Object newItem) {
        likedSongs.add(0, (String) newItem);
    }

    /*
        displays the information in the likedSongs Stack with the appropriate messages
    */
    public String displayStack() {
        int iCount;
        String sMessage = "";
        if (likedSongs.isEmpty()) {
            sMessage = sMessage.concat("The Liked Songs playlist is empty");
        } else {
            sMessage = "The Liked Songs playlist contains: ";
            for (iCount = 0; iCount < likedSongs.size(); iCount++) {
                sMessage = sMessage.concat(likedSongs.get(iCount));
                sMessage = sMessage.concat(", ");
            }
        }
        return sMessage;
    }

    /*
        Searches the likedSongs arrayList and if there is a match it store that to a different array and the appropriate message is shown to the user
    */
    public String search() {
        String response = "";
        if (likedSongs.isEmpty()) {
            response = response.concat("Sorry there are no songs to search for");
        } else {
            String searchTerm = JOptionPane.showInputDialog(null, "Please enter a song to search");
            ArrayList<String> searchMatches = new ArrayList();
            for (String songName : likedSongs) {
                if (songName.equalsIgnoreCase(searchTerm)) {
                    searchMatches.add(songName);
                    response = response.concat("Title of song found is ");
                    for (String song : searchMatches) {
                        response = response.concat(song).concat(" ");
                    }
                } else {
                    response = response.concat("Song entred couldn't be found");
                }
            }
        }
        return response;
    }
    /*
        It creates a copy of the likedSongs array and stores it to a different one and the copy is shown to the user
    */
    public String repeat() {
        String response = "";
        ArrayList<String> repeat = new ArrayList();
        int rep;
        rep = 1;
        for (int i = 0; i < rep; i++) {
            repeat.addAll(likedSongs); 
            response = response.concat("Playlist was repeated with the songs ");
            for (String song : repeat) {
                response = response.concat(song).concat(", ");
            }
        }
        return response; 
    }

}
