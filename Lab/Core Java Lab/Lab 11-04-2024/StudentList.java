//1. Write a program using Vector to store the list of students details and print the details.


package com.ANP_C7344;
import java.util.Vector;

public class StudentList 
{
    public static void main(String[] args)
    {
        Vector<String> students = new Vector<>();// Creating a Vector to store student details

        students.add("Name:Rutuja Age:20   Roll No:101");// Adding student details to the Vector
        students.add("Name:Neha   Age: 21  RollNo:102");
        students.add("Name:Priya  Age: 22  RollNo:103");

        System.out.println("List of Students:");// Printing student details from the Vector
        for (String student : students) 
        {
            System.out.println(student);
        }
    }
}
//output:
//List of Students:
//Name:Rutuja Age:20   Roll No:101
//Name:Neha   Age: 21  RollNo:102
//Name:Priya  Age: 22  RollNo:103
