//WAP for creating the mini calculator. you have to perform an operation on. the basis of user choice until the user press yes to continue(add, mu mul, sub ,div)

import java.util.Scanner;

class MiniCalculator                                     //class name            
{
    public static void main(String args[])               //main method
	{
      Scanner scanner = new Scanner(System.in);           //created object with name scanner to read user input
      String choice;                                        //char is declared to store users choice
      do	  
	  
       System.out.println("Choose operation:");             //printing the choose operation
       System.out.println("1. Addition");
       System.out.println("2. Subtraction");
       System.out.println("3. Multiplication");
       System.out.println("4. Division");
       System.out.print("Enter your choice (1/2/3/4): ");            //printing the choices (1/2/3/4)
       int operation = scanner.nextInt();
            
       System.out.print("Enter first number: ");                   //printing Enter first number
       double num1 = scanner.nextDouble();                        //getting the input from user
       System.out.print("Enter second number: ");
       double num2 = scanner.nextDouble();
            
            if (operation == 1)                                   //check the operation
			{
                System.out.println("Result: "+(num1+num2));       //print the result
            } 
			else if (operation == 2)                               //check the operation
			{
                System.out.println("Result: "+(num1-num2));          //print the result
            } 
			else if (operation == 3) 
			{
                System.out.println("Result: "+(num1*num2));
            } 
			else if (operation == 4) 
			{
               if (num2 != 0) 
			  {
                System.out.println("Result: "+(num1/num2));
              } 
			   else 
			  {
               System.out.println("Can't divide by zero");
              }
            } 
			else 
			{
              System.out.println("Invalid");
            }
            
            System.out.print("Do you want to continue? (yes/no): ");                //printing Do you want to continue? (yes/no)
            choice = scanner.next().charAt(0);                                      // take the first character as input
        } 
		while (choice == 'Y');                                                      //enter the choice if we enter 'Y'the loop continues otherwise it exit
		}
}



/*C:\Users\shree\Desktop\PROGRAM>java MiniCalculator
Choose operation:
1. Addition
2. Subtraction
3. Multiplication
4. Division
Enter your choice (1/2/3/4): 2
Enter first number: 90
Enter second number: 50
Result: 40.0
Do you want to continue? (yes/no): Y
Choose operation:
1. Addition
2. Subtraction
3. Multiplication
4. Division
Enter your choice (1/2/3/4):/*