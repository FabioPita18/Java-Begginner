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
public class tryCatch {

    public void doThis() throws Exception {
//        try{
        doThat();
//        }catch(Exception e){
//            System.out.println("Exception caught:" + e.getMessage());
//        }
    }

    public void doThat() throws Exception {
        System.out.println("doThat: Throwing exception.");
        throw new Exception("Ouch!");

    }

}
