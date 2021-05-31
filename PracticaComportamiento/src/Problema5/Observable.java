/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problema5;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Chuz2
 */
public class Observable {
    protected List<Observer> observers = new LinkedList<Observer>();
    private int state;

    public int getState(){
        return state;
    }
    
    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer obvs){
        observers.add(obvs);
    };
    public void dettach(Observer obvs){
        observers.remove(obvs);
    };
 
    public void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
