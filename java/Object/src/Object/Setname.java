package Object;

public class Setname {
	private String name;
	public String breed;
	public String color;
	
	public void setName(String name) {
		this.name = name;
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
