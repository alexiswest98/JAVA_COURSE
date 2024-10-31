package Ch7;
//Alexis West
//October 30, 2024
//Lab 13
//This program will take inputs from the user and fill an array of specified size and return the sum of all
//the integers as well with the integer's percentage of contribution to the sum.

import java.util.Arrays;
import java.util.Scanner;

public class AnalyzeArrays {
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        int arraySize = keyboard.nextInt();
        int sum = 0;
        int[] newArray = new int[arraySize];

        System.out.println("Enter " + arraySize + " integers, one per line:");

        for(int i = 0; i < newArray.length; i++) 
        {
            newArray[i] = keyboard.nextInt();
            sum += newArray[i];
        }

        System.out.println("The sum is " + sum + ".");
        System.out.println("The numbers are");

        for(int num : newArray)
        {
            double percentage = ((double)num / sum) * 100;  
            // NOTE: when casting make sure to use paranthesis for type casting an equation like this
            String percFormat = String.format("%.4f%%", percentage);
            System.out.println(num + ", which is " + percFormat + "% of the sum.");
        }

        keyboard.close();
    }
}
