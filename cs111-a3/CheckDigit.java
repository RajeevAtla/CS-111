/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author: Rajeev Atla, rajeev.atla@rutgers.edu, 208003072
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {

        long num = Long.parseLong(args[0]);
        long numCopy1 = num;
        long numCopy2 = num/10;

        int sum1 = 0;
        int sum2 = 0;

        while(numCopy1 > 0)
        {
            sum1 += numCopy1 % 10;
            numCopy1 /= 100;
        }

        sum1 %= 10;

        while(numCopy2 > 0)
        {
            sum2 += numCopy2 % 10;
            numCopy2 /= 100;
        }

        sum2 = (sum2 * 3) % 10;

        int sum = sum1 + sum2;
        sum %= 10;

        System.out.println(sum);
    }
}