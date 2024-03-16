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
public class GenreA implements Interface1 {
    
    /*
       declaring the array 
    */
    private ArrayList<String> genreA;
    
    public GenreA() {
        genreA = new ArrayList<String>();
    }

    public boolean isEmpty() {
        return genreA.isEmpty();
    }

    public int size() {
        return genreA.size();
    }
    /*
        adds the string to the array
    */
    public void enqueue(Object newItem) {
        genreA.add((String) newItem);
    }
    
    /*
        displays the information in the genreA queue
    */
    public String displayQueue() {
        int iCount;
        String sMessage = "";
        if (genreA.isEmpty()) {
            sMessage = sMessage.concat("The Rap playlist is empty");
        } else {
            sMessage = "The Rap playlist contains: ";
            for (iCount = 0; iCount < genreA.size(); iCount++) {
                sMessage = sMessage.concat(genreA.get(iCount));
                sMessage = sMessage.concat(", ");
            }
        }
        return sMessage;
    }
}
