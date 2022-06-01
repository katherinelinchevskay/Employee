package com.company;

public class EmployeeNamePrinter implements Printer {

    @Override
    public void print(Employee employee) {
        System.out.println("First name: " + employee.firstName);
        System.out.println("Last name: " + employee.lastName);
    }
}
