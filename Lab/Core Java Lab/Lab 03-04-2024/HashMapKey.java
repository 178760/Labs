//1 Write a Java program to check whether a HashMap contains key-value mappings (empty) or not

package com.ANP_C7344;

import java.util.HashMap;

public class HashMapKey 
{
	public static void main (String[]args)
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();// Creating a new HashMap object with Integer keys and String values
		
		System.out.println("Is HashMap Empty: " +hm.isEmpty());//Checking if the HashMap is empty and printing the result
		hm.put(1, "value1");// Adding key-value pairs to the HashMap
		hm.put(2, "value2");
		hm.put(3, "value3");
		hm.put(4, "value5");
		System.out.println(hm);// Printing the HashMap
		System.out.println("Is HashMap Empty: " +hm.isEmpty());// Checking if the HashMap is empty again and printing the result


	}

}
//output:
//Is HashMap Empty: true
//{1=value1, 2=value2, 3=value3, 4=value5}
//Is HashMap Empty: false
