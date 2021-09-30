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

    private int empID;
    private String empAdd;
    private char empGen;
    private double empCellNo;

    public void display() {
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Empolyee Address: " + getEmpAdd());
        System.out.println("Employee Gender: " + getEmpGen());
        System.out.println("Employee Cell Number: " + getEmpCellNo());
    }

    public Employees(int empID, String empAdd, char empGen, double empCellNo) {
        this.empID = empID;
        this.empAdd = empAdd;
        this.empGen = empGen;
        this.empCellNo = empCellNo;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpAdd() {
        return empAdd;
    }

    public void setEmpAdd(String empAdd) {
        this.empAdd = empAdd;
    }

    public char getEmpGen() {
        return empGen;
    }

    public void setEmpGen(char empGen) {
        this.empGen = empGen;
    }

    public double getEmpCellNo() {
        return empCellNo;
    }

    public void setEmpCellNo(double empCellNo) {
        this.empCellNo = empCellNo;
    }

    @Override
    public String toString() {
        return "\nEmployee Address: " + getEmpAdd() + "\nEmployee Cell Number: " + getEmpCellNo()
                + "\nEmployee ID: " + getEmpID() + "\nEmployee Gender: " + getEmpGen();
    }
}
