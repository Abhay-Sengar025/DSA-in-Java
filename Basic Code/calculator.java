import java.util.*;
public class calculator {
    public static void main (String args[]) {
        System.out.print("Select one Option to perform that task \n 1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division \n");
        Scanner sc = new Scanner (System.in);
        int calculator = sc.nextInt();
        switch(calculator) {
            case 1 :
            System.out.print("Welcome in Addition \n Please Enter two number :- ");
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            int c = a1 + b1;
            System.out.print("Addition of "+ a1 +" and "+ b1 + " is "+ c);
            break;
            case 2 :
            System.out.print("Welcome in Subtraction \n Please Enter two number :- ");
            int a2 = sc.nextInt();
            int b2 = sc.nextInt();
            int d = a2 - b2;
            System.out.print("Subtraction of "+ a2 +" and "+ b2 + " is "+ d);
            break;
            case 3 :
            System.out.print("Welcome in Multiplication \n Please Enter two number :- ");
            int a3 = sc.nextInt();
            int b3 = sc.nextInt();
            int e = a3 * b3;
            System.out.print("Multiplication of "+ a3 +" and "+ b3 + " is "+ e);
            break;
            case 4 :
            System.out.print("Welcome in Division \n Please Enter two number :- ");
            int a4 = sc.nextInt();
            int b4 = sc.nextInt();
            if (b4 != 0) {
                int f = a4 / b4;
                System.out.print("Division of "+ a4 +" and "+ b4 + " is "+ f);
            }
            else {
                System.out.print("Not Defined ");
            }
            break;
            default :
            System.out.print("Invalid Output");
        }
    }
}
