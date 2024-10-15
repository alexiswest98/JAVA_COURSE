package Ch5;
//Alexis West
//October 2, 2024
//Lab 10
//This lab will have two classes (main and test) and take in 3 integers and return if they are in order.

public class InOrder {

    public boolean inOrder(int num1, int num2, int num3) 
    {
        if(num1 < num2 && num2 < num3)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
