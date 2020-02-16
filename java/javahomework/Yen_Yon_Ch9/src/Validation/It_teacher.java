package Validation;

public class It_teacher extends Thing {
	private int yearsOfExperience;

	public It_teacher(String name, int yearsOfExperience) {
		super(name);
		this.yearsOfExperience = yearsOfExperience;

	}

	@Override
	public boolean isValid() {
		if (yearsOfExperience > 2) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		String message;
		if (isValid()) {

			message = super.toString() + " Valid ";
		} else {
			message = super.toString() + " Invalid ";
		}
		return message;
	}

}
