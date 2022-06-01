package com.company;

public class EmployeeSalaryPrinter implements Printer {

    @Override
    public void print(Employee employee) {
        System.out.println("Salary: " + employee.salary);
    }
}
