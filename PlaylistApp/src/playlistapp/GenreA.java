/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlistapp;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Matty School
 */
public class GenreA implements Interface1 {
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

    public Object frontElement() {
        if (genreA.size() > 0) {
            return genreA.get(0);
        } else {
            return null;
        }
    }

    public void enqueue(Object newItem) {
        genreA.add((String) newItem);
    }

    public Object dequeue() {
        if (genreA.size() > 0) {
            return genreA.remove(0);
        } else {
            return null;
        }
    }
}
