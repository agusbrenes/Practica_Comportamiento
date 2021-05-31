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
        Observable obs = new Observable();
        
        Book book1 = new Book("The Hunger Games", "Suzanne Collins", "4th");
        Book book2 = new Book("The Hunger Games", "Suzanne Collins", "3th");
        
        book1.equals(false);
        book2.equals(true);
        
    }
}

