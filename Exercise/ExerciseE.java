// Reattempt
import java.util.Scanner;

public class ExerciseE {
    public static void AgeLimit (int Age) {
        if ( Age >= 18) {
            System.out.println("Eligible for Voting");
            return;
        } 
        else { System.out.println("Not Eligible for Voting"); return;}
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your age :-");
        int Age = sc.nextInt();

        AgeLimit(Age);
    }
}