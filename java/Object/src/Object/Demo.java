package Object;

public class Demo {

	public static void main(String[] args) {
//		Dog dog1 = new Dog("kiki","long","white",12);
		Dog dog1 = new Dog();
		System.out.println(dog1.name);
		System.out.println(dog1.breed);
		System.out.println(dog1.color);
		System.out.println(dog1.age);
		dog1.eat();
		dog1.bark();
		
		Dog dog2 = new Dog("Justin beber");
		dog2.bark();
		
	}

}
