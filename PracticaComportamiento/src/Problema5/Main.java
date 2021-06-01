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
public class Main {
    public static void main(String[] args){
        
        Inventory inv = new Inventory();
        User user = new User(inv);
        
        Book book1 = new Book("The Hunger Games", "Suzanne Collins", "4th");
        Book book2 = new Book("The Hunger Games Part II", "Suzanne Collins", "3th");
        inv.addBook(book1);
        inv.addBook(book2);
        
        user.requestBook("The Hunger Games");
        user.returnBook();
        user.requestBook("The Hunger Games Part II");
        user.returnBook();
    }
}

