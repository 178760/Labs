//2 write a program in Java to create a Map Interface where we can store the cricketer name in it along with his scores and search for 
//the batsman name and display his score.

package com.ANP_C7344;
import java.util.HashMap;
import java.util.Map;

public class MapInterface 
{
    public static void main(String[] args)
    {
    
        Map<String, Integer> cs = new HashMap<String, Integer>(); // Creating a Map to store cricketer names and their scores

        cs.put("Sachin", 90);// Adding  cricketers and their scores
        cs.put("Virat", 80);
        cs.put("Rohit", 70);
        cs.put("Dhoni", 50);

        String batsman = "Virat";// Searching for a batsman and displaying his score
        if (cs.containsKey(batsman)) 
        {
            int score = cs.get(batsman);
            System.out.println(batsman + " score is: " + score);
        } else 
        {
            System.out.println("Batsman's score not found");
        }
    }
}

//output : 
//Virat score is: 80





