/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5;

/**
 *
 * @author fabio
 */
public class arrayExample {
    public static void main(String[] args) {
        String [] names = {"Fabio","Tony","Cassidy","Sydney","Hercules"};
        for(String name : names) {
            if (name == "Fabio"){
                System.out.println(name + " had a party");
            }else{
                System.out.println(name + " had no party");
            }
        }
    }
}
