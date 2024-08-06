package p5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketerScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashMap to store cricketer names and their scores
		Map<String, Integer> cricketerScores = new HashMap<>();

		// Adding some cricketers and their scores to the HashMap
		cricketerScores.put("Virat Kohli", 75);
		cricketerScores.put("Rohit Sharma", 89);
		cricketerScores.put("Steve Smith", 50);
		cricketerScores.put("Joe Root", 65);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the batsman");
		String name = sc.nextLine();

		if (cricketerScores.containsKey(name)) {
			System.out.println(name + "'s score is " + cricketerScores.get(name));
		} else {
			System.out.println("Cricketer not found.");
		}
		
		// close the Scanner
		sc.close();
	}

}
