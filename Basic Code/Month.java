import java.util.*;
public class Month {
    public static void main (String args[]) {
        System.out.println("Enter a Number of Month which you want to Display");
        Scanner sc = new Scanner (System.in);
        int month = sc.nextInt();
        switch(month) {
            case 1 : 
            System.out.println("This is January");
            break;
            case 2 : 
            System.out.println("This is Feburary");
            break;
            case 3 : 
            System.out.println("This is March");
            break;
            case 4 : 
            System.out.println("This is April");
            break;
            case 5 : 
            System.out.println("This is May");
            break;
            case 6 : 
            System.out.println("This is June");
            break;
            case 7 : 
            System.out.println("This is July");
            break;
            case 8 : 
            System.out.println("This is August");
            break;
            case 9 : 
            System.out.println("This is September");
            break;
            case 10 : 
            System.out.println("This is October");
            break;
            case 11 : 
            System.out.println("This is November");
            break;
            case 12 : 
            System.out.println("This is December");
            break;
        }
    }
}
