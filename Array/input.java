package Array;

import java.util.*;

public class input {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Array Size :- ");
        int marks = sc.nextInt();
        int num[] = new int[marks];
        System.out.println("Enter array values :- ");
        for (int i = 0; i < marks; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("These are the values :-");
        for (int i = 0; i < marks; i++) {
            System.out.println(num[i]);
        }
    }
}
