package p5;

public class FromatNumber {

	public static String formatPhoneNumber(String phoneNumber) {
		// Check if the input is exactly 10 digits
		if (phoneNumber == null || phoneNumber.length() != 10 || !phoneNumber.matches("\\d+")) {
			throw new IllegalArgumentException("Input must be a 10-digit number.");
		}

		// Format the phone number with dashes
		String formattedNumber = phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 6) + "-"
				+ phoneNumber.substring(6, 9);

		return formattedNumber;
	}

	public static void main(String[] args) {

		
		try {
			String formatted = formatPhoneNumber("1234567890");
			System.out.println("Formatted Phone Number: " + formatted);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}

}
