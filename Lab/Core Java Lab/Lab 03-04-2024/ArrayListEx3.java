/* 4. Write a program to declare stack.Store 10 elements into it. Remove 4 elements from stack and display it. */

package com.collectionexample;
import java.util.Stack;

public class ArrayListEx3
{

	public static void main(String[] args)
	{
	       Stack<Integer> s = new Stack<Integer>();// Creating a stack to store integers

	        s.add(1);// Adding integers to the stack
	        s.add(2);
	        s.add(3);
	        s.add(4);
	        s.add(5);
	        s.add(6);
	        s.add(7);
	        s.add(8);
	        s.add(9);
	        s.add(10);

	        System.out.println("Elements in the stack: " + s);// Printing the elements in the stack
	        
	        int p1=s.pop();// Remove and bring back the top element from the stack
	        System.out.println("Removed element from the stack:"+s);
	        
	        int p2=s.pop();
	        System.out.println("Removed element from the stack:"+s);
	        
	        int p3=s.pop();
	        System.out.println("Removed element from the stack:"+s);
	        
	        int p4=s.pop();
	        System.out.println("Removed element from the stack:"+s);
	        
	        System.out.println("Updated Elements in the stack: " + s);// Print the updated elements in the stack
	        
	    }
}

/*   output:   Elements in the stack: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		       Removed element from the stack:[1, 2, 3, 4, 5, 6, 7, 8, 9]
			   Removed element from the stack:[1, 2, 3, 4, 5, 6, 7, 8]
			   Removed element from the stack:[1, 2, 3, 4, 5, 6, 7]
			   Removed element from the stack:[1, 2, 3, 4, 5, 6]
			   Elements in the stack: [1, 2, 3, 4, 5, 6] */