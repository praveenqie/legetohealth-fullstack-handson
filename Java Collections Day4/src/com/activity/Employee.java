package com.activity;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private double salery;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salery) {
		super();
		this.id = id;
		this.name = name;
		this.salery = salery;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalery() {
		return salery;
	}

	public void setSalery(double salery) {
		this.salery = salery;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salery=" + salery + "]";
	}

	@Override
	public int compareTo(Employee employee) {
		return this.id - employee.getId();
	}

}
