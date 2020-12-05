package com.System.peopleservice.Model;



import javax.persistence.*;


@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private int salary;

    @Column
    private int age;

    @Column
    private String about;

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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", about=" + about + "]";
	}
    
    

    
}
