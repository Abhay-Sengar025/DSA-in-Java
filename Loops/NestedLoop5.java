// Half pyramid reverse along with 180 turn
import java.util.*;
public class NestedLoop5 {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter that nth number :-");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
