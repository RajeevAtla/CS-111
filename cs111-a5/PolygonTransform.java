/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {

	// WRITE YOUR CODE HERE
        double[] returnArray = new double[array.length];

        for(int i = 0; i < array.length; i++)
        {
            returnArray[i] = array[i];
        }

        return returnArray;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {

	// WRITE YOUR CODE HERE

        for(int i = 0; i < x.length; i++)
        {   
            x[i] = alpha*x[i];
            y[i] = alpha*y[i];
        }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {

	// WRITE YOUR CODE HERE

        for(int i = 0; i < x.length; i++)
        {
            x[i] = x[i] + dx;
            y[i] = y[i] + dy;
        }
        
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

	// WRITE YOUR CODE HERE

        double[] xCopy = copy(x);
        for(int i = 0; i < x.length; i++)
        {
            x[i] = x[i] * Math.cos(theta) - y[i] * Math.sin(theta);
            y[i] = y[i] * Math.cos(theta) + xCopy[i] * Math.sin(theta);
        }
        
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) 
    {
	    // WRITE YOUR CODE HERE
        // Rotates polygon 45 degrees. 
        StdDraw.setScale(-5.0, +5.0); 
        double[] x = { 0, 2, 1, 3, 4, 5, 0 }; 
        double[] y = { 0, 0, 2, 4, 7, 2, 0 }; 
        double theta = 45.0; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        rotate(x, y, theta); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
    }
}
