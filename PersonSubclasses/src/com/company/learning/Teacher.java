package com.company.learning;

public class Teacher extends Person {

    private String School;
    private double salary;

    Teacher(String name, String address, String School, double salary) {
        super(name, address);
        this.School = School;
        this.salary = salary;
    }

    /*public String getSchool() {
        return School;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }*/

    public String teacherDetails() {
        return super.getDetails() + ", School: " + School + ", Salary: " + salary;
    }
}
