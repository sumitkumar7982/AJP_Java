package p5;

public class PasswordStrengthChecker {

	public static String checkPasswordStrength(String password) {
		// Check for null or empty password
		if (password == null || password.length() < 8) {
			return "Weak password"; // Password must be at least 8 characters long
		}

		// Flags to check the presence of required character types
		boolean hasUppercase = false;
		boolean hasLowercase = false;
		boolean hasDigit = false;
		boolean hasSpecial = false;

		for (char ch : password.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				hasUppercase = true;
			}
			if (Character.isLowerCase(ch)) {
				hasLowercase = true;
			}
			if (Character.isDigit(ch)) {
				hasDigit = true;
			}
			if (Character.isLetterOrDigit(ch)) {
				hasSpecial = true;
			}
		}

		if (hasUppercase && hasLowercase && hasDigit && hasSpecial) {
			return "Strong password";
		} else {
			return "Weak password";
		}
	}

	public static void main(String[] args) {

		String[] testPasswords = { "P@ssw0rd", // Strong
				"password", // Weak

		};

		for (String password : testPasswords) {
			System.out.println("Password: \"" + password + "\" - " + checkPasswordStrength(password));
		}
	}

}
