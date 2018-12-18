package test1;

import java.util.Comparator;

public class Person implements Comparator<Person>{
	private String type;
	@Override
	public String toString() {
		return "Person [type=" + type + ", speed=" + speed + ", weight=" + weight + "]";
	}
	private int speed;
	private int weight;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Person(int speed, int weight, String type) {
		super();
		this.speed = speed;
		this.weight = weight;
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		if(o1.speed!=o2.speed) {
		return o1.getSpeed()-o2.getSpeed();
		}else {
			return o2.getWeight()-o1.getWeight();
		}
	}

}
