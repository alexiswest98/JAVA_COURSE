package Ch7;
//Alexis West
//October 21, 2024
//Lab 11
//This program will create a Basketball game object and make methods for said game to track score.

// Class representing the basketball game
class BasketballGame 
{
    private String teamAName;
    private String teamBName;
    private int teamAScore;
    private int teamBScore;
    private boolean isFinished;

    // Constructor
    public BasketballGame(String teamAName, String teamBName) 
    {
        this.teamAName = teamAName;
        this.teamBName = teamBName;
        this.teamAScore = 0;
        this.teamBScore = 0;
        this.isFinished = false;
    }

    //Record one point scored for a team
    // .equalsIgnoreCase found https://www.w3schools.com/java/ref_string_equalsignorecase.asp
    public void scoreOnePoint(String team) 
    {
        if (team.equalsIgnoreCase("a")) 
        {
            teamAScore += 1;
        } 
        else if (team.equalsIgnoreCase("b")) 
        {
            teamBScore += 1;
        }
    }

    //Record two points scored for a team 
    public void scoreTwoPoints(String team) 
    {
        if (team.equalsIgnoreCase("a")) 
        {
            teamAScore += 2;
        } 
        else if (team.equalsIgnoreCase("b")) 
        {
            teamBScore += 2;
        }
    }

    //Record three points scored for a team
    public void scoreThreePoints(String team) 
    {
        if (team.equalsIgnoreCase("a")) 
        {
            teamAScore += 3;
        } 
        else if (team.equalsIgnoreCase("b")) 
        {
            teamBScore += 3;
        }
    }

    //Change the status of the game to finished 
    public void finishGame() 
    {
        isFinished = true;
    }

    //Return the score of a team, needs to put name of team 
    public int getScore(String team) 
    {
        if (team.equalsIgnoreCase("a")) 
        {
            return teamAScore;
        } 
        else if (team.equalsIgnoreCase("b")) 
        {
            return teamBScore;
        }
        return -1;
    }

    //Return the name of the team that is currently winning
    public String getWinningTeam() 
    {
        if (teamAScore > teamBScore) 
        {
            return teamAName;
        } 
        else if (teamBScore > teamAScore) 
        {
            return teamBName;
        } 
        else 
        {
            return "It's a tie";
        }
    }

    // Method to display the current score
    public String displayScore() {
        return teamAName + " " + teamAScore + ", " + teamBName + " " + teamBScore;
    }
}
