//Alexis West
//October 30, 2024
//Lab 14
//This program will create 

/*
Make sure you understand parallel arrays.  For an example of parallel arrays, see ParallelArrayDemo.java

Create a class.  Name it CoffeeShop.  The class manages a small coffee shop.  Tell the person using your 
program which kinds of coffee the shop sells, along with the price of each one.  Ask the user which kind of 
coffee they want to purchase.  Then ask how many cups they want.  Print a bill.

The types of coffee that the shop sells, along with their costs are;
regular coffee ($3.00), Cafe Americano ($2.75), latte ($3.25), Cafe mocha ($3,50), cappuccino ($3.50).

Again, this lab should have two classes.  Each class has its own job.  It does not know any details of the 
other class.  In particular, the CoffeeShop class is the only class that knows the details of how many types 
of coffee and their prices.:

Sample Dialog for the Lab
Here is some sample initial dialogue.  You don't have to use it, but do something similar.

Welcome to ---- Coffee Shop!
Here is our menu.
1. Regular coffee-$3.00
2. Cafe Americano-$2.75
3. Latte-$3.25
4. Cafe mocha-$3.50
5. Cappuccino-$3.50

Which type of coffee do you want (1-5):   (You could also say 0-4, but it's nicer to say 1-5.)
4
How many cups do you want?
2
Your total cost is $7.00
*/


public class CoffeeShop 
{
    String[] typeOfCoffees = new String[5];
    double[] coffeePrices = new double[5];

    //need to fill in constructor
    public CoffeeShop() 
    {
        //fill typeOfCoffees
        typeOfCoffees[0] = "Regular coffee";
        typeOfCoffees[1] = "Cafe Americano";
        typeOfCoffees[2] = "Latte";
        typeOfCoffees[3] = "Cafe mocha";
        typeOfCoffees[4] = "Cappuccino";
    
        //fill coffeePrices
        coffeePrices[0] = 3.00;
        coffeePrices[1] = 2.75;
        coffeePrices[2] = 3.25;
        coffeePrices[3] = 3.50;
        coffeePrices[4] = 3.50;

    }

    //method to calculate the price with input

}
