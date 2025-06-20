import java.util.*;
public class practice {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number :- ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j <= n - 1; j++) {
                System.out.print(" ");
            }  
            for (int j = n; j <= n; j++) {
                System.out.print("*");
            }  
            System.out.println();
        }
    }
}