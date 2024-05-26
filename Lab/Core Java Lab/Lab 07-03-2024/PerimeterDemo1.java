/*3. Write a class with the name Perimeter using function overload that computes the perimeter of a square, a rectangle and a circle. */         


import java.util.Scanner;

class Perimeter              //class name
{
	void calculatePerimeter(double side)   //method to calculate perimeter of a square
	{
      double perimeter = 4 * side;
      System.out.println("Perimeter of square: "+perimeter);
    }

     void calculatePerimeter(double length, double breadth) //method to calculate perimeter of a rectangle
	{
      double perimeter = 2 * (length + breadth);
      System.out.println("Perimeter of rectangle: "+perimeter);
    }

     void calculatePerimeter(int radius)         //method to calculate perimeter of a circle
	{
      double perimeter = 2 *(22/7)* radius;
      System.out.println("Perimeter of circle: "+perimeter);
    }
}

class PerimeterDemo1
{
    public static void main(String[] args)   //main method
	{
        Scanner sc = new Scanner(System.in);           //created a new scanner object for reading user input 
        Perimeter pl = new Perimeter();              //created a new perimeter object for calling the methods to calculate the perimeter

        System.out.println("Choose an option:");      //prints choose an option.
        System.out.println("1. perimeter of squaremethod");
        System.out.println("2. perimeter of rectanglemethod");
        System.out.println("3. perimeter of circlemethod");
        int choice = sc.nextInt();          //reads an integer input from the user and stores it in the variable choice
		
        switch (choice) 
		{
            case 1:                         //when the user chooses option 1 then case1 is executing
                System.out.println("Enter the side of the square: ");
                double side = sc.nextDouble();                 //reads a double input from the user and stores it in the variable side.
                pl.calculatePerimeter(side);         //calling method
                break;
            case 2:                  
                System.out.println("Enter the length of the rectangle: ");
                double length = sc.nextDouble();         //calling method
                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = sc.nextDouble();
                pl.calculatePerimeter(length, breadth); //calling method
                break;
            case 3:
                System.out.println("Enter the radius of the circle: ");
                int radius = sc.nextInt();
                pl.calculatePerimeter(radius);  //calling method
                break;
            default:
                System.out.println("Invalid choice");   //prints message when user enters other option than 1.2.3.
        }

    }
}

/*C:\Users\shree\Desktop\PROGRAM>javac PerimeterDemo1.java

C:\Users\shree\Desktop\PROGRAM>java PerimeterDemo1
Choose an option:
1. perimeter of squaremethod
2. perimeter of rectanglemethod
3. perimeter of circlemethod
1
Enter the side of the square:
2
Perimeter of square: 8.0 */