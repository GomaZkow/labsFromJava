package com.example;
import com.example.domain.*;


public class EmployeTest {
    public static void main(String[] args) {
	Employe emp = new Employe();
	emp.setEmpId(101);
	emp.setName("Jane Smith");
	emp.SetSalary(120_345.27);
	emp.SetSsn("012-24-5678");
	
	
	System.out.println("Employee ID: "+emp.getEmpId());
	System.out.println("Employee Name: "+emp.getName());
	System.out.println("Employee Soc Sec # "+emp.getSsn());
	System.out.println("Employee salary: "+emp.getSalary());
    }
}
