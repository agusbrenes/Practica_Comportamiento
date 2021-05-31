/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problema5;

import java.util.List;

/**
 *
 * @author Chuz2
 */
public class Inventory extends Observable{
    private List<Book> inventory;
    
    public Book loanBook(int index){
        inventory.get(index).equals(false);
        return inventory.get(index);
    }
    
    public void returnBook(int index){
        inventory.get(index).equals(true);
    }
}
