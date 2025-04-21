package com.example.demo.model;

public class Passenger {

	private Integer pid;
	
	private String name;
	
	private String departure;
	
	private String arrival;
	
	private String dateOfJourney;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDateOfJourney() {
		return dateOfJourney;
	}

	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	public Passenger(Integer pid, String name, String departure, String arrival, String dateOfJourney) {
		super();
		this.pid = pid;
		this.name = name;
		this.departure = departure;
		this.arrival = arrival;
		this.dateOfJourney = dateOfJourney;
	}

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Passenger [pid=" + pid + ", name=" + name + ", departure=" + departure + ", arrival=" + arrival
				+ ", dateOfJourney=" + dateOfJourney + "]";
	}
	
	
}
