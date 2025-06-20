// Full Rectangle
import java.util.*;
public class NestedLoops {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter How many Star you wants to print (in Rows :- )");
        int a = sc.nextInt();
        System.out.println("Enter How many Star you wants to print (in Column :- )");
        int b = sc.nextInt();
        for (int i = 1; i <= a; i++ ) {
            for (int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            System.out.println(); // Remind this dont write "*"
        }
    }
}
