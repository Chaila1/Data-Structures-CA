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

    public Object frontElement() {
        if (genreB.size() > 0) {
            return genreB.get(0);
        } else {
            return null;
        }
    }

    public void enqueue(Object newItem) {
        genreB.add((String) newItem);
    }

    public Object dequeue() {
        if (genreB.size() > 0) {
            return genreB.remove(0);
        } else {
            return null;
        }
    }
}
