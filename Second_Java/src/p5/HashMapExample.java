package p5;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create a HashMap to store key-value pairs
        HashMap<String, Integer> map = new HashMap<>();

        // Associate specified keys with specified values
        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("Cherry", 20);

        // Display the HashMap contents
        System.out.println("HashMap contents:");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

	}

}
