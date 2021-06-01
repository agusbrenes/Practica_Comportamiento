/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problema5;

import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Chuz2
 */
public class Inventory extends Observable {
    private HashMap<String, Book> inventory;
    
    public Inventory() {
        super();
        this.inventory = new HashMap();
    }
    
    public void addBook(Book b) {
        this.inventory.put(b.getName(), b);
    }
    
    public Collection<Book> getBooks() {
        return this.inventory.values();
    }
    
    public Book loanBook(String bookname){
        Book book = this.inventory.get(bookname);
        if (book.isAvailable()) {
            book.setAvailable(false);
            notifyAllObservers();
            return book;
        } else {
            notifyAllObservers();
            return null;
        }      
    }
    
    public void returnBook(Book book){
        book.setAvailable(true);
        notifyAllObservers();
    }
}
