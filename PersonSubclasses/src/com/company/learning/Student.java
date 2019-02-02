package com.company.learning;

public class Student extends Person {
    private double gradesAverege;
    private int yearOfBirth;
    private double fee;

    Student(String name, String address, double gradesAverege, int yearOfBirth, double fee) {
        super(name, address);
        this.gradesAverege = gradesAverege;
        this.yearOfBirth = yearOfBirth;
        this.fee = fee;
    }

    /*public double getGradesAverege(){
        return gradesAverege;
    }

    public void setGradesAverege(double gradesAverege){
        this.gradesAverege = gradesAverege;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }*/

    public String studentDetails() {
        return super.getDetails() + ", Year of birth: " + yearOfBirth + ", Grades average: " + gradesAverege + ", Fee: " + fee;
    }

}
