import java.util.*;
class practice {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number :- ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n; k++) {
                for (int j = n - i + 1; j >= 1; j--) {
                    System.out.print(" ");
                }
                for (int j = n; j <= n; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}