/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Rajeev Atla, rajeev.atla@rutgers.edu, rra80
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		// WRITE YOUR CODE HERE

		int rows = Integer.parseInt(args[0]);
		int cols = Integer.parseInt(args[1]);

		int[][] ratings = new int[rows][cols];

		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				ratings[i][j] = Integer.parseInt(args[2 + cols*i + j]);
			}
		}				
		
		int colMax = 0;
		int sumMax = 0;
		int sum = 0;
		
		for(int j = 0; j < cols; j++)
		{
			for(int i = 0; i < rows; i++)
			{
				sum += ratings[i][j];
			}

			
			if(sum > sumMax)
			{
				sumMax = sum;
				colMax = j;
			}

			sum = 0;
		}

		System.out.println(colMax);

		
		
	}	
}	