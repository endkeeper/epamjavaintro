//Даны три точки. Определить, будут ли они на одной прямой.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x1, x2, x3, y1, y2, y3;
        System.out.println("First point:");
        x1 = scn.nextInt();
        y1 = scn.nextInt();
        System.out.println("Second point:");
        x2 = scn.nextInt();
        y2 = scn.nextInt();
        System.out.println("Third point:");
        x3 = scn.nextInt();
        y3 = scn.nextInt();
        boolean x = (x1 == x2 && x1 == x3);
        boolean y = (y1 == y2 && y1 == y3);
        if (x || y) {
            System.out.println("All points on same line");
        } else {
            System.out.println("Points on different lines");
        }
    }

}
