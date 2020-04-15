package com.company.day09;

public abstract class Employee {
    int id;
    String name;
    double salary;

    public Employee() {

    }

    public abstract void work();
}

class CommonEmployee extends Employee {
    public void setInfo(int id, String name, double salary) {
        super.id = id;
        super.name = name;
        super.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("这是个普通员工");
    }
}

class manager extends Employee {
    double bonus;

    public void setInfo(int id, String name, double salary, double bonus) {
        super.id = id;
        super.name = name;
        super.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("这是领导");
    }
}