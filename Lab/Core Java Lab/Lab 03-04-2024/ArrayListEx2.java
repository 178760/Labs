/*3.Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.

Sample Input:

2
5
8
10
15

Expected Output :sum of even number is

20 */


package com.collectionexample;
import java.util.ArrayList;

public class ArrayListEx2 {
	 public static void main(String[] args)
	 {
	    ArrayList<Integer> num = new ArrayList<>();// Creating an ArrayList to store integers
	    
	    num.add(2);// Adding integers to the ArrayList
	    num.add(5);
	    num.add(8);
	    num.add(10);
	    num.add(15);
	    
	     int sum = 0;// Initializing a variable to store the sum of even numbers
	     for (int number : num) //using for loop for iterate through each number in the ArrayList
	      {
	          if (number % 2 == 0) // Checking if the number is even
	          {
	              sum += number;//If the number is even then adding it to the sum
	          }
	      }
	        System.out.println("Sum of even numbers is: " + sum);// Printing the sum of even numbers
	 }
}

//Sum of even numbers is: 20

