//Даны два угла треугольника. Существует ли треуголник с заданными углами и если да, то является ли он прямоугольным

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b, c, angle;
        a = scn.nextInt();
        b = scn.nextInt();
        c = 180 - a - b;
        angle = 90;
        if (c > 0) {
            System.out.println("triangle is exist");
            if (a == angle || b == angle || c == angle) {
                System.out.println("right triangle");
            }
        } else {
            System.out.println("triangle not exist");
        }
    }
}
