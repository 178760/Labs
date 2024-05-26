//WAP to create a simple calculator program that takes user input for two numbers and an operator (+,-,*,/) and performs the corresponding arithmetic operation using conditional statements


public class Calculator         // class name
{
  public static void main(String[] args)   //main method
  {
    Scanner sc = new Scanner(System.in);   // object sc read the input from user

    System.out.println("Enter the first number: ");       //enter first number
    double num1 = sc.nextInt();                          // read input and store into num1

    System.out.println("Enter the second number: ");
    double num2 = sc.nextInt();
		
    System.out.println("Enter the operator (+, -, *, /): ");   //enter the operator
    char operator = sc.next().charAt(0);                       // take the first character as input
		
	double result=0;
		
	if (operator == '+')            //perform additon operation 
	{
      result = num1 + num2;       //store answer into result
    } 
	else if (operator == '-')       //perform subtraction operation
	{
      result = num1 - num2;      
    } 
    else if (operator == '*')       //perform multiplication operation 
	{
      result = num1 * num2;      
    } 
    else if (operator == '/')      //perform division operation
	{
      result = num1 / num2;
    }
	  System.out.println("Result: "+result);     //print the result
			
	}
}