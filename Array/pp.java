import java.util.*;
public class pp {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter radius of circle :- ");
        double radi = sc.nextInt();
        double pi = 3.14;
        double area = pi*radi*radi;
        System.out.println("area of circle is " + area);
    }
}
