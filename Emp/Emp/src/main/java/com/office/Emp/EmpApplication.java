package com.office.Emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class EmpApplication {

	public static void main(String[] args) {


        ApplicationContext ap = SpringApplication.run(EmpApplication.class, args);
        EmployeeService employeeService =ap.getBean(EmployeeService.class);

        employeeService.addEmployee(new Employee(01,"Subash",10000000.0,"IT"));
        employeeService.addEmployee(new Employee(02,"Sasi",10000.0,"HR"));
        employeeService.addEmployee(new Employee(03,"Ashu",20000.0,"Support"));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the department:");
        String s = scan.nextLine();
        System.out.println("Employees with the "+employeeService.getEmployeeByDepartment(s));
        System.out.println(employeeService.getTopPaidEmployee());
	}

}
