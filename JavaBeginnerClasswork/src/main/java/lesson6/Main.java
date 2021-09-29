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
        Employees emp1 = new Employees("Fabio", "Pita", 50, "0890748749", 452666267);
        Employees emp2 = new Employees("Tony", "Galluci", 33, "0115632690", 56729808);

        Employees[] myEmps = {emp1,emp2};
        
        for (Employees emp : myEmps){
            emp.displayDetails();
            System.out.println("\n");
        }
    }
}
