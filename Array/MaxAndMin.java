package Array;
import java.util.*;
public class MaxAndMin {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Size ");
        int size = sc.nextInt();
        System.out.println("Enter Array values :- ");
        int values[] = new int[size];
        for (int i = 0; i < size ; i++) {
            values[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size ; i++) {
            if (values[i] < min) {
                min = values[i];
            }
            if (values[i] > max) {
                max = values[i];
            }
        }
        System.out.println(max + " is Greatest among them");
        System.out.println(min + " is Smallest among them");
    }
}
