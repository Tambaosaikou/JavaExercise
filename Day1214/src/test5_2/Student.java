package test5_2;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int age;
	private int score;
	private String ClassNum;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getClassNum() {
		return ClassNum;
	}

	public void setClassNum(String classNum) {
		ClassNum = classNum;
	}

	public Student(String name, int age, int score, String classNum) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		ClassNum = classNum;
	}
	public Student() {
		
	}

	public void add() {
		List<String> l1 = new ArrayList();
		String ages = Integer.toString(age);
		String scores = Integer.toString(score);
		l1.add(name="1");
		l1.add(ages="1");
		l1.add(scores="50");
		l1.add(ClassNum="1");
	}

}
