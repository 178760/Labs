//2. Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.
//[Hint: Use array and loop and try to access the element beyond the last index]

package com.staticexample;

public class ArrayExample //class name
{
	public static void main(String[] args)//main method
	{
        int[] arr = {1, 2, 3, 4, 5};//declaring and initializing integer array
        try//start a try block
        {
        	for (int i = 0; i <= arr.length; i++) //starts a loop
        		{
                   System.out.println(arr[i]);//prints each element in array
                }
        }
        catch(ArrayIndexOutOfBoundsException e)//start catch block
        {
           System.out.println("Array index out of bound exception occur");//prints message
        }
     }
}

//1
//2
//3
//4
//5
//Array index out of bound exception occur


