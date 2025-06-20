//Reattempt

import java.util.*;
public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number ");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("This is Prime Number");
        } else {System.out.println("This is not Prime number");}
    }
}
