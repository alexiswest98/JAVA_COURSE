//Alexis West
//October 30, 2024
//Lab 14
//This program will create a coffee shop class with specific coffees and prices in separate arrays.
//It will also have a method that calculates the total when given type and amount parameters.

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
    public String CalculateTotal(int type, int amount)
    {
        //have to subtract 1 for index 
        double specPrice = coffeePrices[type - 1];
        double total = specPrice * (double)amount;

        return String.format("%.2f", total);

    }

}
