package Object;

public class Dog {
	public String name;
	public String color;
	public String breed;
	public int age;

	public Dog(String name) {
		this.name = name;
	}
	
//	public Dog(String name,String breed,String color,int age) {
//		this.name = name;
//		this.breed = breed;
//		this.color = color;
//		this.age = age;
//	}
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public void  bark() {
		System.out.println(this.name+" wosse.....");
	}
	public void eat() {
		System.out.println("Donut is my favorite food");
	}
	public void run() {
		System.out.println("we run with 4 legs");
	}
	
}
