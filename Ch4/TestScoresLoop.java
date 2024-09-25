package Ch4;
//Alexis West
//September 18, 2024
//Lab 8
//This program will allow a user to enter any number of student test scores until the user enters 
//a score that is less than 0. It will return the number of scores entered, the highest score, the 
//lowest score, and the arithmetic average.

import java.util.Scanner;

public class TestScoresLoop 
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a test number.");
        int testNumber = keyboard.nextInt();
        int totalScores = 0, highestScore = testNumber, lowestScore = testNumber, sum = 0;

        while(testNumber > 0) 
        {
            totalScores++;
            sum += testNumber;

            if (testNumber > highestScore) 
            {
                highestScore = testNumber;
            }
            if(testNumber < lowestScore) 
            {
                lowestScore = testNumber;
            }

            System.out.println("Enter a new test number.");
            testNumber = keyboard.nextInt();
        }

        keyboard.close();

        double average = ((double)totalScores > 0 ) ? (double)sum / (double)totalScores: 0;

        System.out.println("The number of scores entered was " + totalScores + " .\n" +
                            "The highest score entered was " + highestScore + " .\n" +
                            "The lowest score entered was " + lowestScore + " .\n" +
                            "The average was " + average + " ."
                        );              

    }
}
