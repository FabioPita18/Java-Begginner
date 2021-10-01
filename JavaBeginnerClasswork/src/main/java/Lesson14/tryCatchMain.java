/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14;

/**
 *
 * @author fabio
 */
public class tryCatchMain {

    public static void main(String[] args) {
        tryCatch obj = new tryCatch();
        try {
            obj.doThis();
        } catch (Exception e) {
            System.out.println("Exception caught:" + e.getMessage());
        }
        System.out.println("Back to main method.");
    }
}