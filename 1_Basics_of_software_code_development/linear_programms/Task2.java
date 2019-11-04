package linear_programms;

import java.util.Scanner;

/**
 * Вычилить значение выражения по формуле (все переменные принимают действительные значения)
 * (b+sqrt(b^2+4ac))/(2a)-(a^3)*c + (b ^-2)
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Insert a,b,c");
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double c = scn.nextDouble();
        double numerator = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c);
        double denominator = 2 * a;
        double fraction = numerator / denominator;
        double result = fraction - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.printf("Result: " + "%.1f", result);
    }
}
