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
public class User extends Observer{

    public User(Observable observable) {
        this.observable = observable;
        this.observable.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Algo");
    }
    
}
