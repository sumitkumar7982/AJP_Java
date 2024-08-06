package p5;

public class NumericValidator {

	public static boolean isValidNumeric(String str) {
		if (str == null || str.trim().isEmpty()) {
			return false; // Null or empty string is not valid
		}

		try {
			// Try parsing as integer
			Integer.parseInt(str);
			return true; // Successfully parsed as integer
		} catch (NumberFormatException e) {

			try {
				// Try parsing as double
				Double.parseDouble(str);
				return true; // Successfully parsed as double
			} catch (NumberFormatException e2) {

			}
		}
		return false;

	}

	public static void main(String[] args) {

		String[] testStrings = { "123", "45.67", "-89", "1.23e4", "abc", "12a", "12.34.56" };

		for (String test : testStrings) {
			System.out.println("String: \"" + test + "\" - Is Valid Numeric: " + isValidNumeric(test));
		}
	}
}
