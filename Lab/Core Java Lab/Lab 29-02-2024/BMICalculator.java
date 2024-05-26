/*A program that calculates Body Mass Index (BMI) based on user input of weight and height, and then categorizes the BMI into underweight, normal, overweight,
 or obese categories using if-else statements.*/

import java.util.Scanner;

public class BMICalculator 
{
    public static void main(String args[]) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) 
		{
          System.out.println("underweight");
        } 
		else if (bmi >= 18.5 && bmi < 25) 
		{
          System.out.println("normalweight");
        }
		else if (bmi >= 25 && bmi < 30) 
		{
          System.out.println("overweight");
        } 
		else 
		{
          System.out.println("obese");
        }
    }
}