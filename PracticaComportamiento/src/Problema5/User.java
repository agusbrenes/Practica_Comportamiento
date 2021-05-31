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
public class User{
    private Inventory inventory;
    private Book book = null;
    
    public User(Inventory inventory) {
        this.inventory = inventory;
    }
    
    public Book getBook() {
        return book;
    }

    public void requestBook(String bookname){
        this.book = inventory.loanBook(bookname);
        if (book == null) {
            System.out.println("El libro no estaba disponible...");
        }
    }
    
    public void returnBook() {
        inventory.returnBook(book);
        book = null;
    }
}
