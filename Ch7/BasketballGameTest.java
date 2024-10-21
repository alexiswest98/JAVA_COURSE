package Ch7;
//Alexis West
//October 21, 2024
//Lab 11
//This program will test the Basketball game object and methods for said game to track score.

import java.util.Scanner;

public class BasketballGameTest 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Creating a BasketballGame object
        BasketballGame game = new BasketballGame("Cats", "Dogs");

        // Loop to keep track of the score
        boolean gameInProgress = true;

        // Loop to keep track of the score
        while (gameInProgress) 
        {
            System.out.print("Enter a team (a or b) and score (1, 2, or 3), or 'finish' to end: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("finish")) 
            {
                game.finishGame();
                System.out.println("The game is over. The final score is " + game.displayScore());
                gameInProgress = false;
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length == 2) 
            {
                String team = parts[0];
                int points = Integer.parseInt(parts[1]);

                switch (points) 
                {
                    case 1:
                        game.scoreOnePoint(team);
                        break;
                    case 2:
                        game.scoreTwoPoints(team);
                        break;
                    case 3:
                        game.scoreThreePoints(team);
                        break;
                    default:
                        System.out.println("Invalid score. Please enter 1, 2, or 3.");
                        continue;
                }

                System.out.println(game.displayScore());
                System.out.println(game.getWinningTeam() + " are winning.");
            } 
            else 
            {
                System.out.println("Invalid input. Please enter a team and a score.");
            }
        }

        scanner.close();
    }
}
