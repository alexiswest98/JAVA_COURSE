//Alexis West
//August 28, 2024
//Lab 4
//This program will utilize an if statement and a Dialog box to ask the user if they want 
//a ham sandwich. Then it will give a response based on the answer.

import javax.swing.JOptionPane;

public class SandwichShop 
{
    public static void main (String[] args) 
    {
        int answer= JOptionPane.showConfirmDialog(null,"We're having a sale on ham sandwiches? Do you want one?", "Sandwich Sale", JOptionPane.YES_NO_OPTION);  

        if (answer == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Great! Enjoy your ham sandwich.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Ok. Maybe next time!");
        }
        System.exit(0);
    }
}

// import javax.swing.JOptionPane;
// public class Question40
// {
//     public static void main(String[] args)
//     {
//         String numberString = JOptionPane.showInputDialog(
//                               "Enter a whole number:");
//         JOptionPane.showMessageDialog(null, "The number is "
//                                       + numberString);
//         System.exit(0);
//     }
// }
