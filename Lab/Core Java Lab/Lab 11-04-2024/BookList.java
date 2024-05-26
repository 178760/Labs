//2.Write a program using ArrayDeque to add book names and add,delete the values from both ends of queue.


package com.ANP_C7344;
import java.util.ArrayDeque;

public class BookList 
{
    public static void main(String[] args) 
    {
        ArrayDeque<String> b1 = new ArrayDeque<String>();// Creating an ArrayDeque to store book names

        b1.addFirst("Book 1");// Adding book names to the front of the queue
        b1.addFirst("Book 2");
        b1.addFirst("Book 3");

        b1.addLast("Book 4");// Adding book names to the end of the queue
        b1.addLast("Book 5");
        
        System.out.println("Books in the queue:");// Printing the book queue
        for (String book : b1) 
        {
            System.out.println(book);
        }

        // Remove a book from the front of the queue
        String removedBookFromFront = b1.removeFirst();
        System.out.println("Removed book from the front: " + removedBookFromFront);

        // Remove a book from the end of the queue
        String removedBookFromEnd = b1.removeLast();
        System.out.println("Removed book from the end: " + removedBookFromEnd);

        System.out.println("Updated books in the queue:");// Printing the updated book queue
        for (String book : b1) 
        {
            System.out.println(book);
        }
    }
}

//output:
/*Books in the queue:
Book 3
Book 2
Book 1
Book 4
Book 5
Removed book from the front: Book 3
Removed book from the end: Book 5
Updated books in the queue:
Book 2
Book 1
Book 4
*/
