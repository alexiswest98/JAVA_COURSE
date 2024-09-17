package Ch3;
//Alexis West
//September 11, 2024
//Lab 7
// This program will utilize a switch statement and ask the user for two inputs, the number of sandwiches (int) and type of sandwich(char). 
//It will return the total cost for the type of sandwiches.

import java.util.Scanner;

public class SwitchSandwiches 
{
    public static void main(String[] args) 
    {
        int numberofSandwiches;
        char typeOfSandwich;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of sandwiches you want.");
        numberofSandwiches = keyboard.nextInt();

        System.out.println("Enter type of sandwich by char");
        //case sensitive
        //REFERENCE FOR CODE IDEA Character.toUpperCase: https://www.javatpoint.com/post/java-character-touppercase-method
        typeOfSandwich = Character.toUpperCase(keyboard.next().charAt(0));

        switch (typeOfSandwich) {
            // ham sandwich 8.50 H
            //need 2 decimal places prices
            case 'H':
                System.out.println(numberofSandwiches + " ham sandwiches $" + String.format("%.2f", (double)numberofSandwiches * 8.50));
                break;
            // chicken sandwich 8.00 each C
            case 'C':
                System.out.println(numberofSandwiches + " chicken sandwiches $" + String.format("%.2f", (double)numberofSandwiches * 8.00));
                break;
            // roast beef sandwich 10.00 each R
            case 'R':
                System.out.println(numberofSandwiches + " roast beef sandwiches $" + String.format("%.2f", (double)numberofSandwiches * 10.00));
                break;
            // tuna sandwich 9.00 each T
            case 'T':
                System.out.println(numberofSandwiches + " tuna sandwiches $" + String.format("%.2f", (double)numberofSandwiches * 9.00));
                break;
            // veggie sandwich 8.50 each V
            case 'V':
                System.out.println(numberofSandwiches + " vegetarian sandwiches $" + String.format("%.2f", (double)numberofSandwiches * 8.50));
                break;
            default:
                System.out.println("Not an option for type of sandwich.");
        }
        keyboard.close();
    }
}
