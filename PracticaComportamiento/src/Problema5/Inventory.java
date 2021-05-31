/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problema5;

import java.util.ArrayList;

/**
 *
 * @author Chuz2
 */
public class Inventory extends Observable{
    private ArrayList<Book> inventory;
    
    public Inventory() {
        inventory = new ArrayList();
    }
    
    public void addBook(Book b) {
        inventory.add(b);
        super.attach(b);
    }
    
    public Book loanBook(String bookname){
        Book b = null;
        for (Book book : inventory) {
            if (book.getName().equals(bookname)) {
                b = book;
                break;
            }
        }
        
        if (b == null) {
            return null;
        }
        
        if (b.isAvailable()){
            b.setAvailable(false);
            b.update();
            return b;
        } else {
            return null;
        }        
    }
    
    public void returnBook(Book book){
        book.setAvailable(true);
        book.update();
    }
}
