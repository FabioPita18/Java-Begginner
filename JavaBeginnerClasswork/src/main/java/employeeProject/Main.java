/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeProject;

/**
 *
 * @author fabio
 */
public class Main {

    public static void main(String[] args) {
        HR emp01 = new HR("Tony", "Galluci", 452, "Human Resources", 52300.0, "HR Manager", "Manage HR staff");
        emp01.display();
        emp01.setEmpID(576);
        System.out.println("..........\n");
        emp01.display();
    }

}
