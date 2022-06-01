
package com.company;

public class Main {

    public static void main(String[] args){
        Employee employee1 = new Employee("Ivan", "Ivsanov", 25, "QA", 25000);

        EmployeeNamePrinter namePrinter = new EmployeeNamePrinter();
        namePrinter.print(employee1);

        EmployeeSalaryPrinter salaryPrinter = new EmployeeSalaryPrinter();
        salaryPrinter.print(employee1);

        Employee employee2 = new Employee("", "", 16, "AQA", -50000);
        namePrinter.print(employee2);
        salaryPrinter.print(employee2);
    }
}
