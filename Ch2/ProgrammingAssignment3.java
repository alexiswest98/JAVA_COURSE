package Ch2;
//Alexis West
//August 22, 2024
//Lab 3
//This program will receive an input from the user asking for the height of the plant yesterday and today in 
//whole numbers(inches). Then it will output how much the plant has grown.

import java.util.Scanner; 

public class ProgrammingAssignment3 
{
    public static void main(String[] args)
    {
        //Create Scanner object
        Scanner myPlant = new Scanner(System.in);
        //ask user for height(whole inches, no decimals) today
        System.out.println("Enter the height(inches) of the plant to the nearest whole number today");

        //save user input for today's inches
        int todayInches = myPlant.nextInt();

        //ask user for height(whole inches, no decimals) yesterday
        System.out.println("Enter the height(inches) of the plant to the nearest whole number yesterday");

        //save user input for today's inches
        int yesterdayInches = myPlant.nextInt();

        //store output and print it 
        int totalGrown = todayInches - yesterdayInches;
        System.out.println("The plant has grown a total of " + totalGrown + " inches.");
    }
}
