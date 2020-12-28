/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ndeti.employee.task;

/**
 *
 * @author Ahmed
 */
public class Employee {
    private String fName, lName;
    private Double salary, bouns;

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setBouns(Double bouns) {
        this.bouns = bouns;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    
    public String getFullName() {
        return fName + " " + lName;
    }
    
    public Double getNewSalary() {
        return salary + bouns;
    }
}
