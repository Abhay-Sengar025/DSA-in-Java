// Reattempt
import java.util.Scanner;

public class ExerciseE {
    public static int AgeLimit (int Age) {

        if ( Age >= 18) {
            return"Eligible for Voting";
        } else { System.out.println("Not Eligible for Voting"); }
        return Age;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int Age = sc.nextInt();

        System.out.println(AgeLimit(Age));
    }
}