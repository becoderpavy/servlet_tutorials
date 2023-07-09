package com.stream_finding;

public class Person {

	private String name;

	private String job;

	private int phno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public Person(String name, String job, int phno) {
		super();
		this.name = name;
		this.job = job;
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + ", phno=" + phno + "]";
	}

}
