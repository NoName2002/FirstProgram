package com.company.learning;

public class Person {
    private String name, address;

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    /*public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }*/

    public String getDetails() {
        return name + "( " + address + " )";
    }
}
