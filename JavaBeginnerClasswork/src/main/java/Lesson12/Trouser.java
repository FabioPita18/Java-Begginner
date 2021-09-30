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
public class Trouser extends Clothing {

    private char waist = 'U';
    private String width;

    public Trouser(int itemID, String description, char colorCode, double price, char waist, String width) {
        super(itemID, description, colorCode, price);
        this.waist = waist;
        this.width = width;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Waist: " + getWaist());
        System.out.println("Sleeve: " + getWidth());
    }

    public char getWaist() {
        return waist;
    }

    public void setWaist(char waist) {
        this.waist = waist;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }
    
    
}
