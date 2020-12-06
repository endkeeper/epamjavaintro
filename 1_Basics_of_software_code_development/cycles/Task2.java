//Вычислить значение функции на отрезке a,b с шагом h

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float a, b, h;
        System.out.println("enter point a,b and step h");
        a = scn.nextFloat();
        b = scn.nextFloat();
        h = scn.nextFloat();
        function(a, b, h);
    }

    static void function(float a, float b, float h) {
        for (double i = a; i <= b; i += h) {
            double x = i;
            double y;
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println("If x=" + x + "  then y=" + y);
        }
    }

}
