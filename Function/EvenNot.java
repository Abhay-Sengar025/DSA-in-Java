import java.util.*;
public class EvenNot {
    public static void Even (int num) {
        if (num %2 == 0) {
            System.out.println(num + " is Even number");
            return;
        } else { System.out.println(num + " is not Even number"); return; } 
    }
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number :-");
        int num = sc.nextInt();

        Even(num);
    }
}
