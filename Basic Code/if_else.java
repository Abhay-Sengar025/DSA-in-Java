import java.util.*;
public class if_else {
    public static void main (String args[]) {
        System.out.println("Enter Your Age( in Numbers )");
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Not Adult");
        }
    }
}
