package p5;

public class LongestCommonPrefix {

	// Method to find the longest common prefix
	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return ""; // No strings provided
		}

		// Start with the prefix being the first string
		String prefix = strs[0];

		// Compare this prefix with each string in the array
		for (int i = 1; i < strs.length; i++) {
			prefix = commonPrefix(prefix, strs[i]);

			// If at any point the prefix becomes empty, return immediately
			if (prefix.isEmpty()) {
				return "";
			}
		}

		return prefix;
	}

	// Helper method to find the common prefix between two strings
	private static String commonPrefix(String str1, String str2) {
		int minLength = Math.min(str1.length(), str2.length());

		for (int i = 0; i < minLength; i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return str1.substring(0, i);
			}
		}

		return str1.substring(0, minLength); // Return the common prefix up to the length of the shorter string
	}

	public static void main(String[] args) {
		String[] input1 = { "flower", "flow", "flight" };
		String[] input2 = { "dog", "racecar", "car" };
		String[] input3 = { "interspecies", "interstellar", "interstate" };

		System.out.println("Longest Common Prefix (input1): " + longestCommonPrefix(input1)); // Output: "fl"
		System.out.println("Longest Common Prefix (input2): " + longestCommonPrefix(input2)); // Output: ""
		System.out.println("Longest Common Prefix (input3): " + longestCommonPrefix(input3)); // Output: "inter"
	}
}
