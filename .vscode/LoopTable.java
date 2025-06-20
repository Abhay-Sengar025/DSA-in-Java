import java.util.Scanner;

public class LoopTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        // int upto = sc.nextInt();
        // for (int i = 0; i >= upto; i = i * n) {
        //     System.out.println(n);
        for (int i = 1; i <= 10; i++) {
        System.out.println(i*n);
        }
        
    }
}