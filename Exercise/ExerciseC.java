// reattempt // Done 
import java.util.Scanner;

public class ExerciseC {
    public static float GreaterNum (float a, float b) {

        if ( a > b) {
            return a;
        } else { return b; }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two Number :-");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        
        System.out.println(GreaterNum (a,b) + " is Greater");
    }
}
