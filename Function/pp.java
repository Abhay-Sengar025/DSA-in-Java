import java.util.*;
public class pp {
    public static int multi (int a,int b) {
        return a * b;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two number :- "); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("multiple of " + a + " and " + b + " is " + multi(a,b));
    }
}
