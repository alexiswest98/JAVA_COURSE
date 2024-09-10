//Alexis West
//August 14, 2024
//Lab 1, Demonstration Lab
//This program ... description

public class EggBasket
//class names start with a capital, rest is capital as well
{
    public static void main (String[] args)
    {
        int numberOfBaskets, eggsPerBasket, totalEggs;
        
        numberOfBaskets = 10;
        eggsPerBasket = 6;
        
        totalEggs = numberOfBaskets * eggsPerBasket;

        System.out.print ("If you have ");
        //println is separate line 
        System.out.println (eggsPerBasket + " eggs per basket and ");
        System.out.println (numberOfBaskets + " baskets, then ");
        System.out.println ("the total number of eggs is " + totalEggs);
   }
}
