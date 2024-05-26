//1. Create two thread.one thread is finding the average of the first 10 numbers and another thread is printing the square of the number stored in array arr-(1,20,50,15,30) 
//and make sure both threads can execute simultaneously

package com.threadpackage;

class ThreadAvg implements Runnable

{
    public void run()  //creating run method
    {
        double sum = 0;  //declaring variable
        for (int i = 0; i <= 10; i++) //for loop for itration from 0 to 10
        {
            sum += i; //adding the value of i to the sum variable
        }
        double average = sum / 10;//calculate average of the first 10 numbers
        {
            System.out.println("Average of the first 10 numbers is:" + average);//print the  average of the first 10 numbers
        }
    }
}
class Threadsq implements Runnable
{ 
	public void run() //run method
    {
		int[] arr = {1, 20, 50, 15, 30}; //declaring and initializing integer array
		System.out.println("squared numbers are: ");//prints message
		
        for (int num : arr)//for loop iterates through each element of array
        {
        	System.out.println(num*num+" ");//printing square of the numbers
        }
     }
}

public class AverageThread 
{

    public static void main(String[] args) 
    {
        ThreadAvg a1 = new ThreadAvg(); //creating instance
        Thread t1 = new Thread(a1);//creating new thread t1
        t1.start();//calling run method
        Threadsq s1 = new Threadsq(); //creating instance
        Thread t2 = new Thread(s1);//creating new thread t2
        t2.start();//calling run method
     }
}
//squared numbers are: 
//1 
//400 
//2500 
//225 
//900 
//Average of the first 10 numbers is:5.5
