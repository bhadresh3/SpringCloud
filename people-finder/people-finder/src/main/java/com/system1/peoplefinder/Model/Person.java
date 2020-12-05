package com.system1.peoplefinder.Model;


public class Person {

    private int id;

    private String name;

    private int salary;

    private int age;

    private String about;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, int salary, int age, String about) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.about = about;
	}
    
    

}
