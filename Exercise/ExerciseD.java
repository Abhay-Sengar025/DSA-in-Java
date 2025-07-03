import java.util.*;
public class ExerciseD {
    public static double Circumference (double r) {

        return 2 * 3.14 * r;
    }
    public static void main (String args[]) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter radius of Circle :- ");
    double r = sc.nextDouble();
    
    System.out.println("Perimeter of radius " + r + " is " + Circumference(r));
    }
}
