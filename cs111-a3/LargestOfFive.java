/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author: Rajeev Atla, rajeev.atla@rutgers.edu, 208003072
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {

        int max = Integer.parseInt(args[0]);

        for(int i = 0; i < args.length; i++)
        {
            if(Integer.parseInt(args[i]) > max)
            {
                max = Integer.parseInt(args[i]);
            }
        }

        System.out.println(max);


    }
}