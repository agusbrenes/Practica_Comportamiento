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
public abstract class Observable {
    protected List<Observer> observers;

    public Observable(){
    
    }

    public void attach(Observer obvs){
    
    };
    public void dettach(Observer obvs){
    
    };
    public void notify(){
    
    };
}
