//Create a class named Car with attributes make, model, year, and color. Include a method start() that prints "Car started" and 
//a method stop() that prints "Car stopped

class Car                //class name
{
  String make;          //Attributes
  String model;
  int year;
  String color;
  
  public Car(String make,String model,int year,String color)        //Constructor
  {
    this.make=make;
	this.model=model;
	this.year=year;
	this.color=color;
  }
  
  public void start()           //method to start the car
  {
    System.out.println("Car started");   //printing Car started
  }
  
  public void stop()             //method to stop the car
  {
    System.out.println("Car stopped");    //printing Car started
  }
}
class CarDemo                                   
{
  public static void main(String args[])          // main method
  {
   Car c1=new Car("TATA","Nexon",2020,"purple" );   // created a car object
   c1.start();                                      //Display the output
   c1.stop();                                       //Display the output
  }
}



/*C:\Users\shree\Desktop\PROGRAM>java CarDemo
Car started
Car stopped  */


       
  