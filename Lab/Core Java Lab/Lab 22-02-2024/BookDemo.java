//Create a class named Book with attributes title, author, ISBN, and price. Include methods to get and set the attributes.
class Book 
{
   String title;            //Attributes
   String author;
   String ISBN;
   double price;
   public Book(String title, String author, String ISBN, double price)  //parameterized constructor
  {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.price = price;
  }
     String getTitle()        //Getter methods
	{
      return title;
    }
     String getAuthor() 
	{
      return author;
    }
     String getISBN()
	{ 
	  return ISBN;
    }
     double getPrice() 
	{
      return price;
    }
     void setTitle(String title)          // Setter methods
	{
      this.title = title;
    }
     void setAuthor(String author) 
	{
      this.author = author;
    }
     void setISBN(String ISBN) 
	{
      this.ISBN = ISBN;
    }
     void setPrice(double price) 
	{
      this.price = price;
    }
}
class BookDemo
{
  public static void main(String[] args)         //main method
  {
       
        Book b1 = new Book("Wings of fire", "Dr. APJ Abdul Kalam", "9788173711466", 200);      //creating new object with parameterized constructor
        System.out.println("Title: " + b1.getTitle());                                        
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("ISBN: " + b1.getISBN());
        System.out.println("Price: " + b1.getPrice());
   }
}