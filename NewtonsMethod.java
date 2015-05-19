/**
 * Tyler Schumacher
 */
import java.util.*;
public class NewtonsMethod
{
    public static void main(String[] args)
    {
        System.out.println("The unique root to sin(x) = 0, with an initial guess of 2, to within 7 decimal places,");
        System.out.println("using the Newton's Method.");
        System.out.println("Runtime: " + newtonsMethod(2,10,.0000001));
    }
    public static int newtonsMethod(double guess,int max,double tol)
    {
        int count = 0;
        double m, x1, y;
        for (int x=1; x<=max; x++)
        {
            y = Math.sin(guess)/Math.cos(guess);
            m = guess - (Math.sin(guess)/Math.cos(guess));
            if (Math.abs(y) < tol)
            {
                break;
            }
            guess= m;
            count++;
            System.out.println("Iteration #" + count+ ": " + round(guess,7));
        }
        return count;
    }
    public static double round(double value, int dPlaces)
    {
        double x = Math.pow(10, dPlaces);
        double y = value * x;
        return Math.round(y)/x;
    }
}