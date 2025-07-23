package Array;
import java.util.*;
public class NamePrinter {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter array size :- ");
        int size = sc.nextInt();
        System.out.println("Enter names :- ");
        String name[] = new String[size];
        for (int i = 0; i < size; i++) {
            name[i] = sc.next();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(name[i]);
        }
    }
}
