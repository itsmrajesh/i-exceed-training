package com.training.oop.execise.employee;

public class Employee {
	int id;
	String name;
	Address address;
	Project project;

	public Employee(int id, String name, Address address, Project project) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.project = project;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public void showEmpInfo() {
		System.out.println("Employee Details");
		System.out.println("---------------------------");
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("---------------------------");
		project.showProjectInfo();
		System.out.println("---------------------------");
		address.ShowAddress();
	}

}
