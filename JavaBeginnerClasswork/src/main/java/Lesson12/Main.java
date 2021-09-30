/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12;

/**
 *
 * @author fabio
 */
public class Main {

    public static void main(String[] args) {
        Shirt shirt01 = new Shirt(15, "Hawaiain", 'R', 55.6, 'M', "Short Sleeve");
        shirt01.display();

        System.out.println("...............\n");
//        Trouser trouser01 = new Trouser(16, "Camo", 'G', 100.00, 'L', 78, 'M');
//        trouser01.display();

        System.out.println("...............\n");
        Clothing shirt02 = new Shirt(17, "Golf", 'G', 199.0, 'M', "Long sleeve");
        if (shirt02 instanceof Shirt) {
            System.out.println("Golf Shirt Fit: " + ((Shirt) shirt02).getFit());
        } else {
            System.out.println("Item is not a shirt");
        }

        System.out.println(".................");
        shirt02.display();
        
        System.out.println(shirt02.toString());
    }
}
