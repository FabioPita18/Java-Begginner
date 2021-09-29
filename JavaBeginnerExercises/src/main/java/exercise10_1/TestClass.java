/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise10_1;

/**
 *
 * @author fabio
 */
public class TestClass {

    public static void main(String args[]) {
        int x = 4, y = 9;
//        if ((y / x) < 3) {
//            x += y;
//        } else {
//            x *= y;
//        }
//
//        System.out.println("After if statement, x = " + x);

        x = ((y / x) < 3) ? (x += y) : (x *= y);
        System.out.println("After ternary operators, x = " + x);
    }
}
