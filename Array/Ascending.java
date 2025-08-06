// little bit confusing
package Array;
import java.util.*;
public class Ascending {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Size ");
        int size = sc.nextInt();
        System.out.println("Enter Array values :- ");
        int values[] = new int[size];
        for (int i = 0; i < size ; i++) {
            values[i] = sc.nextInt();
        }
        Boolean isAscending = true;
        for (int i = 0; i < size - 1; i++) {
            if (values[i] > values[i+1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("This array sorted in ascending order");
        } else { System.out.println("This array not sorted in ascending order");}
    }
}
