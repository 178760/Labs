/* Write a program to demonstrate static block take two static variables name and id and print them. */


class StaticBlock        //class name
 {
   static String name;  //static variables
   static int id;

    static                 // Static block to initialize static variables
	{
      name = "Rucita";  //assign the value
      id = 101;     //assign the value
    }
 }

class StaticBlockDemo
{
    public static void main(String[] args)  //main method
	{
      System.out.println("ID: "+StaticBlock.id);      //Print static variable name
	  System.out.println("Name: "+StaticBlock.name);  // Print static variable name
    }
}
