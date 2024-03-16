/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlistapp;

import java.util.ArrayList;

/**
 *
 * @author Matty School
 */
public class GenreB implements Interface1 {

    private ArrayList<String> genreB;

    public GenreB() {
        genreB = new ArrayList<String>();
    }

    public boolean isEmpty() {
        return genreB.isEmpty();
    }

    public int size() {
        return genreB.size();
    }

    public void enqueue(Object newItem) {
        genreB.add((String) newItem);
    }

    public String displayQueue() {
        int iCount;
        String sMessage = "";
        if (genreB.isEmpty()) {
            sMessage = sMessage.concat("The Rnb playlist is empty");
        } else {
            sMessage = "The Rnb playlist contains: ";
            for (iCount = 0; iCount < genreB.size(); iCount++) {
                sMessage = sMessage.concat(genreB.get(iCount));
                sMessage = sMessage.concat(", ");
            }
        }
        return sMessage;
    }
}
