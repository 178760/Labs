/*1.Define a class Address representing an address with attributes such as street, city, state, and zip code. Provide constructors 
to initialize Tove these attributes.*/


class Address      //class name
{
  String street;          //Attributes
  String city;
  String state;
  int zipCode;
   
  Address(String street,String city,String state,int zipCode)         // Parameterized constructor
  { 
    this.street=street;
    this.city=city;
	this.state=state;
	this.zipCode=zipCode;
  }
  Address()                              //No-argument constructor
  {
    this.street="Bhavani Peth";
    this.city="Solapur";
	this.state="Maharashtra";
	this.zipCode=413002;
  }
  void printData()               //to print the data of the object
  {
    System.out.println("Street: "+this.street+" City: "+this.city+" State: "+this.state+" ZipCode:"+this.zipCode);
  }
}
  
class AddressDemo
{
  public static void main(String args[])     //main method
  {
    Address a1=new Address("Main Road Terkheda","Osmanabad","Maharashtra",413525);         //calling the new object with Parameterized constructor
	Address a2=new Address(); 	     //creating the new object with No-argument constructor
	a1.printData();                  //calling the print method
	a2.printData();
  }
}

/*C:\Users\shree\Desktop\PROGRAM>javac AddressDemo.java

C:\Users\shree\Desktop\PROGRAM>java AddressDemo
Street: Main Road Terkheda City: Osmanabad State: Maharashtra ZipCode:413525
Street: Bhavani Peth City: Solapur State: Maharashtra ZipCode:413002 /*
	
    