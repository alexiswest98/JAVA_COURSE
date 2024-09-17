package Ch3;
//Alexis West
//September 11, 2024
//Lab 6
// This program will calculate and print a service charge for cashing a check using an if - else statement.

import java.util.Scanner;

public class CalulatingLoanFee
{
    public static void main(String[] args) 
    {
        //store amount of check from user 
        Scanner myCheckScanner = new Scanner(System.in);

        System.out.println("What is the value of your check?");

        double checkAmount = myCheckScanner.nextDouble();
        double serviceCharge = 0;

        // if check < 10; charge +1
        if(checkAmount < 10)
            serviceCharge++;
        //if check > 10 but < 100; charge x .10 of og amount
        else if (checkAmount > 10 && checkAmount < 100) 
        {
            serviceCharge = checkAmount * .10;
        }
        //if amount > 100 but < 1000; charge + 5 + .05 of og amount
        else if (checkAmount > 100 && checkAmount < 1000) 
        {
            serviceCharge = 5 + (checkAmount * .05);
        }
        //if value > 1000; charge + 40 + .01 of og amount
        else 
            serviceCharge = 40 + (checkAmount * .01);
        
        double returnedAmount = checkAmount - serviceCharge;

        System.out.println(checkAmount + " (amount of check)\n" +
                            serviceCharge + " (service charge)\n" +
                            returnedAmount + " (amount returned to you)");
    }
}
