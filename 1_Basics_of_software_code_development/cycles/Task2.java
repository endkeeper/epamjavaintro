package cycles;

import java.util.Scanner;

/**
 * Вычислить значения для функции на отрезке a,b с шагом h
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a,b and h");
        float a = scn.nextFloat();
        float b = scn.nextFloat();
        float h = scn.nextFloat();
        float y;
        for (float x = a; x <= b; x += h) {
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println("If x = " + x + " y = " + y);
        }
    }
}
