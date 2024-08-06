package p5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayListToSet {

	// TODO Auto-generated method stub
	// Generic function to convert an Array to Set
	public static <P> Set<P> convertArrayToSet(P array[]) {
		// Create the Set by passing the Array
		// as parameter in the constructor
		Set<P> set = new HashSet<>(Arrays.asList(array));
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
