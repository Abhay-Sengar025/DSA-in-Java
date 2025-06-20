// Even Num Series upto nth number 
import java.util.*;
public class EvenLoop {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter How many Even number you want ");
        int num = sc.nextInt();
        System.out.println("Your series is this ");
        for (int i = 2; i <= num; i += 2) {
            System.out.print(i + " ");
        }
    }
}
