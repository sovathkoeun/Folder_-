package Validation;

public class Bike extends Thing {
	private int age;
	private boolean isFrontBreakWorking;
	private boolean isBackBreakWorking;

	public Bike(String name, int age, boolean isFrontBreakWorking, boolean isBackBreakWorking) {
		super(name);
		this.age = age;
		this.isFrontBreakWorking = isFrontBreakWorking;
		this.isBackBreakWorking = isBackBreakWorking;
	}

	@Override
	public boolean isValid() {
		if (age < 2 && (isFrontBreakWorking || isBackBreakWorking)) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		String message;
		if (isValid()) {
			message = super.toString() + " " + age +"years "+ " Valid ";
		} else {
			message = super.toString() + " " + age+"years "+" Invalid ";
		}
		return message;
	}
}
