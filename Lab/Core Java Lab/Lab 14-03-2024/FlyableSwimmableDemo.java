/* Define interfaces Flyable' and 'Swimmable with methods fly() and swim() respectively. Implement these interfaces in a class 'Bird to demonstrate 
multiple interface implementation. */


interface Flyable   //interface name
{
  public void fly();  //fly method
}
interface Swimmable   //interface name
{
  public void swim();  //swim method
}
class Bird implements Flyable, Swimmable  //class bird implementing both Flyable and Swimmable interface
{
    public void fly() 
	{
      System.out.println("Bird is flying..");  //prints the message
    }
    public void swim() 
	{
      System.out.println("Bird is swimming..");  //prints the message
    }
}

class FlyableSwimmableDemo 
{
    public static void main(String[] args)  //main method
	{
      Bird b1 = new Bird(); //create new object of Bird class
      b1.fly();      //calling the fly method
      b1.swim();     //calling the swim method
    }
}