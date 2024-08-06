package p5;

public class ArrOutOfBond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i <= arr.length; i++) {
			try {
				// Access the element at index 'i'
				System.out.println("Element at index " + i + ": " + arr[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				// Handle the exception
				System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
			}
		}
	}
}
