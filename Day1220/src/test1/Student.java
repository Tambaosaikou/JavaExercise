package test1;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = 4269573468049383483L;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Student(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
