package com.example.domain;

public class Employe {
    public int empId;
    public String name;
    public String ssn;
    public double salary;


    public Employe() {
	System.out.println("Я родился");
    }

    public int getEmpId() {
	return empId;
    }
    public void setEmpId(int empId) {
	this.empId=empId;
    }

    public String getName() {
	return name; 
    }
    public void setName(String name) {
	this.name=name;
    }

    public String getSsn() {
	return ssn;
    }
    public void SetSsn(String Ssn) {
	ssn = Ssn;
    }
    
    public String getSalary() {
  	return ssn;
      }
      public void SetSalary(double salary) {
  	this.salary = salary;
      }
    
    
}
