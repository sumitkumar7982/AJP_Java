package p5;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PriorityQueue<String> queue =
				 new PriorityQueue<String>(15, new MyComparator());
				 queue.add("Tyrion Lannister");
				 queue.add("Daenerys Targaryen");
				 queue.add("Arya Stark");
				 queue.add("Petyr 'Littlefinger' Baelish");
				 /*
				 * What I am doing here is removing the highest
				 * priority element from Queue and displaying it.
				 * The priority I have set is based on the string
				 * length. The logic for it is written in Comparator
				 */
				 while (queue.size() != 0)
				 {
				 System.out.println(queue.poll());
				 }

	}

}
 class MyComparator implements Comparator<String> {
	 @Override
	 public int compare(String x, String y)
	 {
	 return y.length()- x.length();
	 }
	 }
