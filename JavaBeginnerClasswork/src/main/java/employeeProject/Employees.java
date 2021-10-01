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
public class Employees {

    private String firstName;
    private String lastName;
    private int empID;
    private String department;
    private double salary;

    public Employees(String firstName, String lastName, int empID, String department, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empID = empID;
        this.department = department;
        this.salary = salary;

    }

    public void display() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name; " + getLastName());
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Department: " + getDepartment());
        System.out.println("Salary: " + getSalary());
    }

    public String Employees() {
        return "Employee: " + firstName + "\n" + "Last name: " + lastName
                + "Employee ID: " + empID + "\n"
                + "Department: " + department + "\n"
                + "Salary: " + salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
