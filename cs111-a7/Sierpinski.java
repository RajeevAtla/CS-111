/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author: Rajeev Atla, rajeev.atla@rutgers.edu, rra80
 *
 *************************************************************************/
import java.lang.Math;

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {

	// WRITE YOUR CODE HERE

        return Math.sqrt(3) * (0.5) * length; 

    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {

        double h = height(length);
        double halfLength = length/2.0;
	    double[] xC = new double[]{x, x - halfLength, x + halfLength};
        double[] yC = new double[]{y, y + h, y + h};

        StdDraw.filledPolygon(xC, yC);
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {


        if(n > 0)
        {
            double halfLength = length/2.0;
            
            sierpinski(n - 1, x, y + height(length), halfLength);
            sierpinski(n - 1, x + (halfLength), y, halfLength);
            sierpinski(n - 1, x - (halfLength), y, halfLength);

            filledTriangle(x, y, length);
        }
        
    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        double l = 1;
        double h = height(l);
        double halfLength = l/2.0;

        double[] xCoords = new double[]{0, halfLength, l};
        double[] yCoords = new double[]{0, h, 0};
        StdDraw.polygon(xCoords, yCoords);

        sierpinski(n, halfLength, 0, halfLength);
    }
}
