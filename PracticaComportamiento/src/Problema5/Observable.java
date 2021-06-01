/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problema5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chuz2
 */
public abstract class Observable {
    protected List<Observer> observers;
    public Observable () {
        this.observers = new ArrayList();
    }

    public abstract void attach(Observer obvs);
    public abstract void dettach(Observer obvs); 
    public abstract void notifyAllObservers();
}
