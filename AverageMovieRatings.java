public class AverageMovieRatings {
    
    public static void main (String[] args)
    {
        int[] ratings = new int[args.length];

        for(int i = 0; i < args.length; i++)
        {
            ratings[i] = Integer.parseInt(args[i]);
        }

        int sum = 0;

        for(int i = 0; i < ratings.length; i++)
        {
            sum += ratings[i];
        }

        System.out.println(((double) sum)/(ratings.length));
    }
}
