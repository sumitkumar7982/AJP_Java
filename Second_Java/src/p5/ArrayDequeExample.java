package p5;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
		 * Wecannot create instance of a Deque as it is an
		 * interface, we can create instance of ArrayDeque or
		 * LinkedList and assign it to Deque
		 */
		 Deque<String> dq = new ArrayDeque<String>();
		 /*
		 *
		 /*
		 * Adding elements to the Deque.
		 * addFirst() adds element at the beginning
		 and addLast() method adds at the end.
		 */
		 dq.add("Glenn");
		 dq.add("Negan");
		 dq.addLast("Maggie");
		 dq.addFirst("Rick");
		 dq.add("Daryl");
		 dq.offerFirst("sumit");
		 dq.offerLast("kumar");
		 System.out.println("Elements in Deque:"+dq);
		 
//		 * Wecan remove element from Deque using remove() method,
//		 * we can use normal remove() method which removes first
//		 * element or we can use removeFirst() and removeLast()
//		 * methods to remove the first and last element respectively.
		 
		 System.out.println("Removed element: "+dq.removeLast());
		 /*
		 * element() method- returns the head of the
		 * Deque. Head is the first element of Deque
		 */
		 System.out.println("Head: "+dq.element());
		 /*
		 * pollLast() method- this method removes and returns the
		 * tail of the Deque(last element). Returns null if the Deque is empty.
		 * Wecan also use poll() or pollFirst() to remove the first element of
		 * Deque.
		*/
		 System.out.println("poll(): "+dq.pollLast());
		 /*
		 * peek() method- it works same as element() method,
		 * however it returns null if the Deque is empty. We can also use
		 * peekFirst() and peekLast() to retrieve first and last element
		 */
		 System.out.println("peek(): "+dq.peekLast());
		 //Again printing the elements of Deque
		 System.out.println("Elements in Deque:"+dq);

	}

}
