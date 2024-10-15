package Ch5;
//Alexis West
//October 2, 2024
//Lab 10
//This lab will test the main class to make sure the 3 integers are in order and return a boolean.

public class InOrderTest {

    public static void main(String[] args)
    {
        InOrder myTwoClasses = new InOrder();

        System.out.println(myTwoClasses.inOrder(10, 11, 12) + ": 10,11,12 are in order.");
        System.out.println(myTwoClasses.inOrder(24, 25, 26) + ": 24,25,26 are in order.");
        System.out.println(myTwoClasses.inOrder(100, 99, 98) + ": 100,99,98 are not in order.");
        System.out.println(myTwoClasses.inOrder(10, 9, 8) + ": 10,9,8 are not in order.");
    }
}
