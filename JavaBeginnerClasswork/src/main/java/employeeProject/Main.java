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
        emp01.setEmpID(576);
        System.out.println("..........\n");
        emp01.display();

        IT emp02 = new IT("Fabio", "Pita", 387, "Information Technology", 67000.0, "Back-end", "Team manager");

        emp02.setEmpID(832);
        System.out.println("..........\n");
        emp02.display();

        Acc emp03 = new Acc("Gianluca", "Palmarozza", 523, "Accounting", 81000.0, "General accounts", "Charted Accountant");

        emp03.setEmpID(907);
        System.out.println("..........\n");
        emp03.display();
    }
}
