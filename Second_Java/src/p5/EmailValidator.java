package p5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	// Regular expression to validate an email address
	private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

	public static String validateEmail(String email) {
		if (email == null || email.isEmpty()) {
			return "Invalid email address"; // Null or empty string is not valid
		}

		Matcher matcher = EMAIL_PATTERN.matcher(email);

		if (matcher.matches()) {
			return "Valid email address"; // The email matches the pattern
		} else {
			return "Invalid email address"; // The email does not match the pattern
		}
	}

	public static void main(String[] args) {

		String[] testEmails = { "example@email.com", "user.name+tag+sorting@example.com", "user@sub.domain.com",
				"user@domain", "@no-local-part.com", "no-at-sign.com", "user@domain.c", "user@domain..com" };

		for (String email : testEmails) {
			System.out.println("Email: \"" + email + "\" - " + validateEmail(email));
		}

	}

}
