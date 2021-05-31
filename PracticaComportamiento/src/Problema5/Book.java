/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problema5;

/**
 *
 * @author Chuz2
 */
public class Book {
    private String name;
    private String author;
    private String edition;
    private boolean available;
    
    public Book(String name, String author, String edition){
        this.name = name;
        this.author = author;
        this.edition = edition;
        this.available = true;
    }
    
    public void equals(boolean available){
        this.available = available;
    }
}
