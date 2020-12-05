//вычислить значение выражения по формуле

import java.util.Scanner;
import java.lang.Math;

public class Task2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a, b, c, result;
        System.out.println("Enter variables a,b,c");
        a = scn.nextDouble();
        b = scn.nextDouble();
        c = scn.nextDouble();
        result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Result: " + result);
    }
}
