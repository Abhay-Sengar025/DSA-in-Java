import java.util.*;
public class Function {
    public static void TableNum(int a, int b) {
        for (int i = 1; i <= b; i++) {
            int num = a * i; 
            System.out.println(a +" x "+ i +" = "+ num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number whose product you want :- ");
        int a = sc.nextInt();
        System.out.println("Enter range :- ");
        int b = sc.nextInt();
        System.out.println("Table of "+ a +" upto "+ b +" is :-");
        TableNum(a, b);
    }
}