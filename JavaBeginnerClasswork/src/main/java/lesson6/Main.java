/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

/**
 *
 * @author fabio
 */
public class Main {
    public static void main(String[] args) {
       Employees emp1 = new Employees ();
       
       emp1.name = "Fabio";
       emp1.surname ="Pita";
       emp1.age = 50;
       emp1.contactNum = "0890748749";
       emp1.identityNum = 452666267;
       
       emp1.setAge (55);
       
        System.out.println("Name: " + emp1.getName());
        System.out.println("Surname: " + emp1.getSurname());
        System.out.println("Age: " + emp1.getAge());
        System.out.println("Contact Number: " + emp1.getContactNum());
        System.out.println("ID Number: " + emp1.getIdentityNum());
       
    }
}
