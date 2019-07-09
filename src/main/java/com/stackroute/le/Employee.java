package com.stackroute.le;

public class Employee {

    private int age;
    private String name;
    private String lastname;
    public Employee(int age,String name,String lastname)
    {
        this.age=age;
        this.name=name;
        this.lastname=lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}


