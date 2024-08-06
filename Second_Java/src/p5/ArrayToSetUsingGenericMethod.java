package p5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSetUsingGenericMethod {

	// Generic function to convert an Array to Set
	public static <T> Set<T> convertArrayToSet(T array[]) {
		// Create an empty Set
		Set<T> set = new HashSet<T>();
		// Iterate through the array
		for (T t : array) {
			// Add each element into the set
			set.add(t);
		}
		// Return the converted Set
		return set;
	}

	public static void main(String args[]) {
		// Create an Array
		String array[] = { "aa", "bb", "cc" };
		// Print the Array
		System.out.println("Array: " + Arrays.toString(array));
		// convert the Array to Set
		Set<String> set = convertArrayToSet(array);
		// Print the Set
		System.out.println("Set: " + set);

	}

}
