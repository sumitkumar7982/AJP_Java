package p5;

import java.util.HashMap;

public class HashMapEmptyCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create a HashMap to store key-value pairs
        HashMap<String, Integer> map = new HashMap<>();
        
        if(map.isEmpty()) {
        	System.out.println("Hashmap is empty");
        }
        else {
        	System.out.println("hashmap having soome elements");
        }
        
        // Add some key-value pairs to the HashMap
        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("Cherry", 20);

        // Check again if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }
        System.out.println();
        
     // Display the HashMap contents
        System.out.println("HashMap contents:");
        for(String key:map.keySet()) {
        	System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

	}

}
