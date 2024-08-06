package p5;

import java.util.*;

public class ReverseStringList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Aman");
		list.add("Rahul");
		list.add("Naresh");
		list.add("Govind");

		System.out.println("The list is:" + list);
		// Calling reverse method..
		Collections.reverse(list);
		System.out.println("The reversed list is:" + list);

	}

}
