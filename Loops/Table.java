import java.util.*;

public class Table {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number whose table you wants to print :-");
        double num = sc.nextDouble();
        System.out.println("Enter range upto which you want table goes :-");
        double upto = sc.nextDouble();
        System.out.println("Here is your Table ");
        for (int i = 1; i <= upto; i++) {
            double multi = num * i;
            System.out.println(num + " x " + i + " = " + multi);
        }
    }
}
