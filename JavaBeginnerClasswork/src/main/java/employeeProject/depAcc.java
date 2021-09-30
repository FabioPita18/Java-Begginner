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
public class depAcc extends Employees {

    private double salary;
    private String name;
    private int workHours;

    public depAcc(int empID, String empAdd, char empGen, double empCellNo, double salary, String name, int workHours) {
        super(empID, empAdd, empGen, empCellNo);
        this.salary = salary;
        this.name = name;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + getSalary());
        System.out.println("Name: " + getName());
        System.out.println("Work hours per day: " + getWorkHours());
        System.out.println("\n");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}
