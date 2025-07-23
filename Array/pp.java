package Array;
import java.util.*;
public class pp {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Array size :-");
        int size = sc.nextInt();
        System.out.println("Enter Array number :- ");
        int num[] = new int[size];
        for (int i = 0; i < size ; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter number you wants to find :-");
        int find = sc.nextInt();
        for (int i = 0; i < size ; i++) {
            if (num[i] == find) {
                System.out.println("they value you want is in " + i + "position");
            }
        }
    }
}
