package p5;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //creatingaHashSet
		HashSet<String> str= new HashSet<String>();
		 //displaying the initial size
		 System.out.println("Size at the beginning "+str.size());
		 //add elements
		 str.add("apple");
		 str.add("kiwi");
		 str.add("banana");
		 str.add("orange");
		 //displaying the HashSet
		 System.out.println("Added few elements:"+str);
		 //displaying the size
		 System.out.println("Size after addition "+str.size());
		 //remove element using value
		 str.remove("banana");
		 //display the new HashSet
		 System.out.println("After remove banana from set: the elements will be:"+str);
		 //display the new size
		 System.out.println("Size after removal "+str.size());
		 str.clone();
		 System.out.println("Size after removal "+str);
		 
		boolean res =  str.contains("apple");
		System.out.println(res);
		str.clear();
		System.out.println(str);
	
	}

}
