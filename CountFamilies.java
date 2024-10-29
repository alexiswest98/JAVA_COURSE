//Alexis West
//October 28, 2024
//Lab 12
//This program will analyze data from different families and put the records in an array.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountFamilies
{
    public static void main(String[] args) 
    {
        //Read an integer k from the keyboard and then create an array of size k.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer for the size of the family array");
        int arraySize = keyboard.nextInt();

        int newarr[] = new int[arraySize];
        int maxIncome = 0;

        //read k values representing family income from the keyboard and place them into the array
        for(int i = 0; i < arraySize; i++)
        {
            System.out.println("Enter a family's income in the form of an integer please.");
            newarr[i] = keyboard.nextInt();
            //Find the maximum income among these
            if(newarr[i] > maxIncome) maxIncome = newarr[i];
        }
        
        //count the families that make less than 10 percent of this maximum income
        // use arrayList bc array will change in size
        int famCount = 0;
        ArrayList<Integer> lessFamList = new ArrayList<>();

        for (int income : newarr) 
        {
            if (income < (maxIncome * 0.10)) 
            {
                lessFamList.add(income);
                famCount++;
            }
        }

        //Display this count and these families and their incomes
        //Label the information in your printout
        System.out.println("Original incomes: " + Arrays.toString(newarr));
        System.out.println("Maximum income is: " + maxIncome);
        System.out.println("Number of families making less than 10% of the maximum income: " + famCount);
        System.out.println("Incomes of families making less than 10% of max income: " + lessFamList);
        
        keyboard.close();
    }
}
