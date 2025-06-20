// Half pyramid Reverse
import java.util.*;
public class NestedLoop4 {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter How many Star you wants to print ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++ ) {
            for (int j = n; j >= n - i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
