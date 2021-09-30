/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise13_2;

/**
 *
 * @author fabio
 */
public class Sock extends Clothing implements Returnable{
    private double price;
    private final String matrialType1 = "Cotton";
    private final String matrialType2 = "Wool";
    private final String matrialType3 = "Silk";

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
