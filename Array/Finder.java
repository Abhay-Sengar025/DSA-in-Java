// This is algorithum name linear Search 
package Array;
import java.util.*;
public class Finder {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Array Size :-");
        int marks = sc.nextInt();
        int num[] = new int[marks];
        System.out.println("Enter array values");
        for (int i = 0; i < marks; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter number which you wants to find :- ");
        int find = sc.nextInt();

        for (int i = 0; i < marks; i++) { 
            if (num[i] == find) {
                System.out.println("number find at index : " + i);
            }
        }
    }
}
