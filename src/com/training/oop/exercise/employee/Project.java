package com.training.oop.exercise.employee;

public class Project {
	private int projectId;
	private String projectName;
	private String clientName;
	private String clientLocation;
	private double budget;

	public Project(int projectId, String projectName, String clientName, String clientLocation, double budget) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.clientName = clientName;
		this.clientLocation = clientLocation;
		this.budget = budget;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientLocation() {
		return clientLocation;
	}

	public void setClientLocation(String clientLocation) {
		this.clientLocation = clientLocation;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public void showProjectInfo() {
		System.out.println("Project Details");
		System.out.println("Project ID : " + projectId);
		System.out.println("Project Name : " + projectName);
		System.out.println("Client Name : " + clientName);
		System.out.println("Client Location : " + clientLocation);
		System.out.println("Project Budget : " + budget);
	}

}
