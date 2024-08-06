package p5;

public class AgeValidator {

	public void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above.");
		}
		// If age is valid, the method continues execution normally.
	}

	public static void main(String[] args) {

		{
			AgeValidator validator = new AgeValidator();
			try {
				int age = 18;
				validator.validateAge(age);
				System.out.println("Age is valid!");
			} catch (InvalidAgeException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}

	}

}
