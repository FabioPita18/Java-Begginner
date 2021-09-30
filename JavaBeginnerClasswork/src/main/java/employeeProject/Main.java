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
public class Main extends Employees implements EmploymentStatus {

    public static void main(String[] args) {
        Employees team02 = new depIT(2346, "1 Kensington Road", 'M', 0871234989, "Tony", 12);
        team02.display();

        System.out.println("\n");

        System.out.println(((depIT) team02)).doReurn();
    }
}
