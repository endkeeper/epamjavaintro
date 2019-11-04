package linear_programms;

import java.util.Scanner;

/**
 * Вычислить значение выражения по формуле(все переменные принимают действительные значения)
 * (sinx + cosy)/(cosx-siny)*tgxy.
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Insert x,y");
        double x = scn.nextInt();
        double y = scn.nextInt();
        double numerator = Math.sin(x) + Math.cos(y);
        double denominator = Math.cos(x) - Math.sin(y);
        double fraction = numerator / denominator;
        double result = fraction * Math.tan(x * y);
        System.out.printf("Result: " + "%.1f", result);
    }
}
