//Solved by ChatGpt // Reattempt
import java.util.*;
public class ExerciseH {
    public static int Power (int X, int n) {
        int result = 1; 
        for (int i = 1; i <= n; i++) {
            result = result * X;
        } return result;
    }
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Value of X");
        int X = sc.nextInt();
        System.out.println("Enter Value of n");
        int n = sc.nextInt();

        System.out.println("Value of " + X + " raised to the power " + n + " is " + Power (X,n));
    }
}
