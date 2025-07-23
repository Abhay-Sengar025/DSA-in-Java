import java.util.*;
public class TableGiven {
    public static void Table (int num) {
        int n = 1;
        for(int i = 1; i <= num; i++) {
            num = num * i;
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number whose table you want :- ");
        int num = sc.nextInt();

        Table(num);
    }
}
