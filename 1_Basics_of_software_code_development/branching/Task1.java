package branching;

import java.util.Scanner;

/**
 * Даны два угла треугольника( в градусах). Определить, существует ли такой треугольник, и если да, то будет
 * ли он прямоугольным
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the angles");
        int x = scn.nextInt();
        int y = scn.nextInt();
        int sum = x + y;
        if (sum >= 180) {
            System.out.println("Triangle is not exist");
        } else if (x + y == 90) {
            System.out.println("Triangle is right-angled");
        } else {
            System.out.println("Triangle is exist");
        }
    }
}