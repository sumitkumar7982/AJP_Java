package p5;

import java.util.Arrays;

public class AnagramChecker {

	 // Method to check if two strings are anagrams
    public static String checkAnagrams(String str1, String str2) {
        // Remove any non-alphanumeric characters and convert to lowercase
        str1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the lengths are different
        if (str1.length() != str2.length()) {
            return "Not Anagrams";
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        if (Arrays.equals(charArray1, charArray2)) {
            return "Anagrams";
        } else {
            return "Not Anagrams";
        }
    }

    public static void main(String[] args) {
        String[] testPairs = {
            "listen silent",
            "hello world",
            "triangle integral",
           
        };

        for (String pair : testPairs) {
            String[] parts = pair.split(" ");
            if (parts.length == 2) {
                System.out.println("Strings: \"" + parts[0] + "\" and \"" + parts[1] + "\" - " + checkAnagrams(parts[0], parts[1]));
            } else {
                System.out.println("Invalid input pair: " + pair);
            }
        }
    }
}
