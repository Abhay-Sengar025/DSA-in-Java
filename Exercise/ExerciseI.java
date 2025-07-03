import java.util.*;
public class ExerciseI {
    public static int GCD (int a , int b) {
        int num ;
        for (int i = 1; i <= num; i++) {
            num = a / (b * i);
        } return num;
    }
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Divident"); 
        int a = sc.nextInt();
        System.out.println("Enter Divisor ");
        int b = sc.nextInt();

        System.out.println("Greatest Common Factor of Divident " + a + " and Divisor " + b + " is " + GCD(a ,b) );
    }
}
