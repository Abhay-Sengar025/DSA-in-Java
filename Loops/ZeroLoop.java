// like Machine Language
import java.util.*;
public class ZeroLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to Average Finder Machine ");
        System.out.println("Please Enter one number among 0 and 1");
        int num = sc.nextInt() ;
        switch(num) {
            default :
            System.out.println("Invalid Output");
            case 0 : 
            System.out.println("Thank You for Visting");
            break;
            case 1 :
            System.out.println("Please Enter your marks");
            int marks = sc.nextInt();
            if (marks >= 90){
                System.out.println("This is Good");
            } 
            else if (89 >= marks) {
                System.out.println("This is also Good");
            }
            else if (marks >= 60) {
                System.out.println("This is also Good");
            } else {System.out.println("This is Good as well"); }
        }
    }
}

