package p5;

class AgeValidation extends Exception {
	public AgeValidation(String s) {
// Call constructor of parent Exception
		super(s);
	}
}

public class CustomExceptionEx {
	// Driver Program

	static void checkAge(int age) throws AgeValidation {
		if (age < 18) {
			throw new AgeValidation("Age is not valid");
		} else {
			System.out.println("Age is valid");
		}

	}

	public static void main(String args[]) {
		try {
			checkAge(18);
		} catch (AgeValidation ex) {
			// Print the message from MyException object
			System.out.println(ex.getMessage());
		}
	}

}
