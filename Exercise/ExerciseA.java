import java.util.*;
public class ExerciseA {
    public static float AverageOfNum (Float a, Float b, Float c) {

        return (a+b+c)/3;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        Float a = sc.nextFloat();
        Float b = sc.nextFloat();
        Float c = sc.nextFloat();

        System.out.println(" Average of " + a +" , "+ b +" and "+ c +" is ");
        System.out.print(AverageOfNum(a, b, c));
    }
}
