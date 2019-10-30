package branching;

import java.util.Scanner;

/**
 * Вычислить значения функции F(x)= x^2 - x +9, если x<=3;
 * 1/(x^3 + 6), если x<3;
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number x");
        int x = scn.nextInt();
        double y;
        if (x <= 3) {
            y = Math.pow(x, 2) - x + 9;
        } else {
            int numerator = 1;
            double denominator = Math.pow(x, 3) + 6;
            double fraction = numerator / denominator;
            y = fraction;
        }
        System.out.println("Result: " + y);
    }
}
