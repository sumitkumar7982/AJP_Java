package p5;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create a HashSet of Integer type
        HashSet<Integer> numbers = new HashSet<>();

        // Add some elements to the HashSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Display the HashSet before appending a new element
        System.out.println("HashSet before appending new element: " + numbers);

        // Element to be appended
        numbers.add(40);
        numbers.add(50);
        
     // Display the HashSet after appending a new elements
        System.out.println("HashSet after appending new elements: " + numbers);
        

	}

}
