//3.Write a program using TreeSet insert Integer values and print them.


package com.ANP_C7344;
import java.util.TreeSet;

public class TreeSetIntegers 
{
    public static void main(String[] args) 
    {
        
        TreeSet<Integer>  integerTreeSet= new TreeSet<Integer>();// Creating a TreeSet to store integer values

        integerTreeSet.add(1);// Inserting integer values into the TreeSet
        integerTreeSet.add(2);
        integerTreeSet.add(3);
        integerTreeSet.add(4);
        integerTreeSet.add(5);
        
        System.out.println("Integer values in TreeSet:");// Printing the integer values in sorted order
        for (int num : integerTreeSet) 
        {
            System.out.println(num);
        }
    }
}

//output:
//Integer values in TreeSet:
//1
//2
//3
//4
//5


