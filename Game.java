import java.util.Random;

public class Game {
    

     // Generates and returns an even integer 
 // in the range of 0 to 98 inclusive.   

 public static int generateEven() { 

    //You need to write this code 

    Random r = new Random();
    int random = r.nextInt(49+1);
    return random * 2;

 } 

// Generates and returns an odd integer 
// in the range of 1 to 99 inclusive.   

public static int generateOdd() { 

    //You need to write this code

    Random r = new Random();
    int random = r.nextInt(49+1);
    return random*2 + 1;

} 

  /* This method has two parameters: a String array, 
     players, containing the names of players and an 
     int array, theScores, containing the scores of 
     the players such that players[0] has score 
     theScores[0], players[1] has score 
     theScores[1], etc. 

     This method returns a String array containing the 
     winners of the tournament games for that round. 
     The array that is returned is half the 
     size of the parameter array. The tournament 
     pairings are consecutive array elements (i.e. 
     players[0] and players[1] play against each other; 
     players[2] and players[3] play against each other, 
     etc. 
   */ 

 public static String[] nextRound(int[] theScores, String[] players) { 

    
    String[] ans = new String[players.length/2];

    for(int i = 0; i < players.length; i += 2)
    {
        if(theScores[i] > theScores[i+1])
        {
            ans[i/2] = players[i];
        }
        else
        {
            ans[i/2] = players[i+1];
        }
    }

    return ans;

  }

  public static void main(String[] args)
  {
    int numPlayers = Integer.parseInt(args[0]);
    String[] names = new String[numPlayers];
    for(int k = 0; k < names.length; k++)
    {
        names[k] = StdIn.readString();
    }

    while(names.length > 1)
    {
        System.out.println("\nCurrent round of players:");
        int[] scores = new int[names.length];

        for(int i = 0; i < names.length; i++)
        {
            if(i % 2 == 0)
            {
                scores[i] = generateEven();
            }
            else
            {
                scores[i] = generateOdd();
            }
        }
        for(int j = 0; j < names.length; j++)
        {
            System.out.println(names[j] + "\t\t" + scores[j]);
        }
        names = nextRound(scores, names);
    }
  }
}
