package org.generation.util;

import org.generation.exceptions.EmailFormatException;

public class Manager extends Employee {
	private	int numberOfEmployees;
	private double bonus;
	
	public Manager(String name, int age, String email, String address, String rfc, String department, double salary,
			int numberOfEmployees, double bonus) throws EmailFormatException {
		super(name, age, email, address, rfc, department, salary);
		this.numberOfEmployees = numberOfEmployees;
		this.bonus = bonus;
	}// constructor

	
	
	@Override
	public double calculateSalary(int d) {
		// TODO Auto-generated method stub
		return super.calculateSalary(d) + (this.bonus*this.numberOfEmployees);
	}



	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}// getNumberOfEmployees

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}//setNumberOfEmployees

	public double getBonus() {
		return bonus;
	}//getBonus

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}//setBonus

	@Override
	public String toString() {
		return "Manager [numberOfEmployees=" + numberOfEmployees + ", bonus=" + bonus + ", getNumberOfEmployees()="
				+ getNumberOfEmployees() + ", getBonus()=" + getBonus() + ", getDepartment()=" + getDepartment()
				+ ", getSalary()=" + getSalary() + ", getEmail()=" + getEmail() + ", getRFC()=" + getRFC()
				+ ", getAge()=" + getAge() + "]";
	}


	
	
	
	
}
