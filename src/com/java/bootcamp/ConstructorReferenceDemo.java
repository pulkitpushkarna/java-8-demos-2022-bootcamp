package com.java.bootcamp;

class Employee {

    String name;
    Integer age;

    Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

interface EmployeeFunctionalInterface {
    Employee createEmployee(String name, Integer age);
}


public class ConstructorReferenceDemo {

    public static void main(String[] args) {
        EmployeeFunctionalInterface employeeFunctionalInterface= ((name, age) -> new Employee(name,age));
        System.out.println(employeeFunctionalInterface.createEmployee("Pulkit",28));

        EmployeeFunctionalInterface employeeFunctionalInterface2= Employee::new;
        System.out.println(employeeFunctionalInterface2.createEmployee("Sunny",30));

    }
}
