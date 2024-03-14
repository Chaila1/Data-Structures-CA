/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlistapp;
import java.util.*;

/**
 *
 * @author Matty School
 */
public class Liked implements Interface2{
    
    private ArrayList<String> likedSongs;

    /**
     * Create a new instance of Stack
     */
    public Liked() {
        likedSongs = new ArrayList<String>();
    }

    public int size() {
        return likedSongs.size();

    }

    public boolean isEmpty() {
        return likedSongs.isEmpty();
    }

    /**
     * always false as there is no limit on the size of this ArrayList based
     * stack
     */
    public boolean isFull() {
        return false;
    }

    /**
     * removes the item from the top of the stack and returns it
     */
    public String pop() {
        if (!(likedSongs.isEmpty())) {
            return likedSongs.remove(0);
        } else {
            return null;
        }
    }

    /**
     * puts an item onto the top of the stack
     */
    public void push(Object newItem) {
        likedSongs.add(0, (String) newItem);
    }

    // removes all elements from the stack
    public void emptyStack() {
        while (!likedSongs.isEmpty()) {
            pop();
        }
    }

    // return a String object that consists of all elements from the stack
    // a FOR loop is used here, but you can use an Iterator instead
    public String displayStack() {
        int iCount;
        String sMessage = "";
        if (likedSongs.isEmpty()) {
            sMessage = sMessage.concat("The Stack is EMPTY!");
        } else {
            sMessage = "The Stack contains: ";
            for (iCount = 0; iCount < likedSongs.size(); iCount++) {
                sMessage = sMessage.concat(likedSongs.get(iCount));
                sMessage = sMessage.concat("; ");
            }
        }
        return sMessage;
    }
    
}
