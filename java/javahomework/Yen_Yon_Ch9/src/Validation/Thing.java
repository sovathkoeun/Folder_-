package Validation;
public abstract class Thing implements Validable{
	
	private String name;
	public Thing(String name) {
		this.name = name;
	}
	
	public  String toString() {
		return name ;
	}

	
}
