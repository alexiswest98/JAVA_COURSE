//Alexis West
//October 30, 2024
//Lab 14
//This program will test the class CoffeeShop by asking the user for a type of coffee(+1) and amount to
//calculate the total and print it out.

import java.util.Scanner;

/*
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

public class CoffeeShopTest {

    public static void main(String[] args) {

        CoffeeShop transaction = new CoffeeShop();

        System.out.println("Welcome to ---- Coffee Shop!"); 
        System.out.println("Here is our menu."); 
        System.out.println("1. Regular coffee-$3.00"); 
        System.out.println("3. Latte-$3.25"); 
        System.out.println("W4. Cafe mocha-$3.50"); 
        System.out.println("5. Cappuccino-$3.50");
    
    
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which type of coffee do you want(1-5)?");
        int customerType = keyboard.nextInt();

        System.out.println("How many cups do you want?");
        int customerAmount = keyboard.nextInt();

        System.out.println("Your total cost is $" + transaction.CalculateTotal(customerType, customerAmount));
    }
}
