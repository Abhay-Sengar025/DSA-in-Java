/*import java.util.*;
public class less_greater {
    public static void main (String args[]) {
        System.out.println("Enter two number :- ");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Both are Equal");
        }
        else {
            if (a > b) {
                System.out.println(a +" is Greater");
            }
            else {
                System.out.println(b +" is Greater");
            }
        }
        
    }
}*/

import java.util.*;
public class less_greater {
    public static void main (String args[]) {
        System.out.println("Enter two number :- ");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Both are Equal");
        }
        else if (a > b) {
            System.out.println(a +" is Greater");
        }
        else {
            System.out.println(b +" is Greater");
        }
        }
       
    }
