package p5;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Stack of Integer type
        Stack<Integer> stack = new Stack<>();

        // Push 10 elements onto the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        // Display the stack after pushing elements
        System.out.println("Stack after pushing 10 elements: " + stack);
        
        for(int i=0;i<4;i++) {
        	if(!stack.isEmpty()) {
        		stack.pop();
        	}
        }
        // Display the stack after poping 4 elements
        System.out.println("Stack after puping 4 elements: " + stack);

	}

}
