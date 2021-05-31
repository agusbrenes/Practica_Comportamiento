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
        
        new User(obs);
        
        System.out.println("Hmmmmm");
        obs.setState(2);
    }
}
