import java.util.*;
public class Greeting {
    public static void main (String args[]) {
        System.out.println("Choose one number 1 or 2 or 3 and then Enter that number :-");
        Scanner sc = new Scanner (System.in);
        int button = sc.nextInt();
        // Using if else
        // if (button == 1) {
        //     System.out.println("Hello");
        // }
        // else if (button == 2) {
        //     System.out.println("Namaste");
        // }
        // else if (button == 3) {
        //     System.out.println("Bonjour");
        // }
        // else {
        //     System.out.println("Invalid Output");
        // }
        switch(button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Output");
        }
    }
} 

