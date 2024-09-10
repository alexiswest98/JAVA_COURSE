//Alexis West
//September 4, 2024
//Lab 5
//This program will tell you your change after asking for an amount of cents from 35 to a dollar(100).The amount
//entered has to be in increments of 5.

import javax.swing.JOptionPane;

public class MakingChange 
{
    public static void main(String[] args) 
    {
        String amountString = JOptionPane.showInputDialog("Enter a whole amount of change between 35 cents to a dollar(100) that is an increment of 5. \n" +
        "I will return the amount of change in coins");

        int originalAmount, amount, quarters, dimes, nickels, pennies;

        originalAmount = Integer.parseInt(amountString);

        if (originalAmount % 5 != 0) 
        {
            JOptionPane.showMessageDialog(null, "Please try again and choose a number divisible by 5", "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
        else if (originalAmount < 35)
        {
            JOptionPane.showMessageDialog(null, "Please try again and choose a number bigger than 35", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if (originalAmount > 100)
        {
            JOptionPane.showMessageDialog(null, "Please try again and choose a number smaller than 100", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else 
        {
            amount = originalAmount;

            //calculations begin
            quarters = amount / 25;
            amount = amount % 25;
            dimes = amount / 10;
            amount = amount % 10;
            nickels = amount / 5;
            amount = amount % 5;
            pennies = amount;
    
            //return answer
            JOptionPane.showMessageDialog(null, "The change given back from " + originalAmount + " is " 
            + quarters + " quarters, " 
            + dimes + " dimes, "
            + nickels + " nickels, and  " 
            + pennies + " pennies.");
        }
        
        System.exit(0);
    }

}
