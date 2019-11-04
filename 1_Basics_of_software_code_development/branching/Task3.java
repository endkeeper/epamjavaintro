package branching;

import java.util.Scanner;

/**
 * Даны три точки A(x1,y1), B(x2,y2), C(x3,y3). Определить, будут ли они на одной прямой
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter point A");
        float x1 = scn.nextFloat();
        float y1 = scn.nextFloat();
        System.out.println("Enter point B");
        float x2 = scn.nextFloat();
        float y2 = scn.nextFloat();
        System.out.println("Enter point C");
        float x3 = scn.nextFloat();
        float y3 = scn.nextFloat();
        boolean xLine = x1 == x2 && x1 == x3;
        boolean yLine = y1 == y2 && y1 == y3;
        if (xLine || yLine) {
            System.out.println("Points on same line");
        } else {
            System.out.println("Points not on same line");
        }
    }
}