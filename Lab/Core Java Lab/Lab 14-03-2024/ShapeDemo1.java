/*Create a base class with constructor and inherit it in the derived class and call the base class constructor in derived class*/

class Shape  //parent class
{
   String type;  //instance variable
   Shape(String type) //parameterized constructor
  {
    this.type = type;
    System.out.println("The shape constructor is called"); //prints the message
  }
}

class Rectangle extends Shape //child class is inheriting parent class
{
  int length;  //instance variables
  int breadth;
  Rectangle(int length,int breadth ) //parameterized constructor
  {
    super("Rectangle"); // Calling the constructor of parent class shape
    this.length = length;
	this.breadth = breadth;
	System.out.println("The rectangle constructor is called");
    }
}

class ShapeDemo1
{
    public static void main(String[] args)  //main method
	{
      Rectangle r1 = new Rectangle(4,2); //create new instance of rectangle class 
    }
}

/*C:\Users\shree\Desktop\PROGRAM>javac ShapeDemo1.java

C:\Users\shree\Desktop\PROGRAM>java  ShapeDemo1
The shape constructor is called
The rectangle constructor is called/