package Ch2;
//Alexis West
//8/21/24
//Lab 1, Demonstration Lab
//This program calculates a customer's bill

public class CalculateBill 
{
    public static void main (String[] args)
    {
        int charges = 100;
        int salesTax = 12;
        int totalOwed = charges + salesTax;
        System.out.println("You purchased $" + charges
                            + ". Sales tax is $" + salesTax
                            + ". You owe $" + totalOwed + ".");
    }
}
