import java.util.*;
public class calculator {
    public static void main (String args[]) {
        System.out.println("Calculator \nPress 1. For addition \nPress 2. For Subtraction \nPress 3. For Multiplication \nPress 4. For Division \nPress 5. For Modulus/Remainder ");
        Scanner sc = new Scanner (System.in);
        int calculator = sc.nextInt();
        switch (calculator) {
            case 1:
            System.out.println("Welcome in Addition \nPlease Enter two values :- ");
            Double a1 = sc.nextDouble();
            Double b1 = sc.nextDouble();
            Double c1 = a1 + b1;
            System.out.println("Addition of " + a1 + " and " + b1 + " is " + c1);
            break;
            case 2:
            System.out.println("Welcome in Subtraction \nPlease Enter two values :- ");
            Double a2 = sc.nextDouble();
            Double b2 = sc.nextDouble();
            Double c2 = a2 - b2;
            System.out.println("Subtraction of " + a2 + " and " + b2 + " is " + c2);
            break;
            case 3:
            System.out.println("Welcome in Multiplucation \nPlease Enter two values :- ");
            Double a3 = sc.nextDouble();
            Double b3 = sc.nextDouble();
            Double c3 = a3 * b3;
            System.out.println("Multiplication of " + a3 + " and " + b3 + " is " + c3);
            break;
            case 4:
            System.out.println("Welcome in Division \nPlease Enter two values :- ");
            Double a4 = sc.nextDouble();
            Double b4 = sc.nextDouble();
            Double c4 = a4 / b4;
            if ( b4==0 ) {
                System.out.println("Not Defined");
            } else { System.out.println("Division of " + a4 + " and " + b4 + " is " + c4); }
            break;
            case 5:
            System.out.println("Welcome in Modulus/Remainder \nPlease Enter two values :- ");
            Double a5 = sc.nextDouble();
            Double b5 = sc.nextDouble();
            Double c5 = a5 % b5;
            if ( b5==0 ) {
                System.out.println("Not Defined");
            } else { System.out.println("Modulus/Remainder of " + a5 + " and " + b5 + " is " + c5); }
            break;
            default:
            System.out.println("Invalid Output");
            break;
        }

    }
}
