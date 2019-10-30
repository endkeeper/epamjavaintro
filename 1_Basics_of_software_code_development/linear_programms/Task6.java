package linear_programms;

import java.util.Scanner;

/**
 * Для данной области составить линейную программу, которая печатает true,
 * если точка с координатами (х,y) принадлежит закрашенной области, и false
 * - в противном случае
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Inset (x,y)");
        int x = scn.nextInt();
        int y = scn.nextInt();
        boolean firstRectangle = (y >= 0 && y <= 4 && x >= -2 && x <= 2);
        boolean secondRectangle = (y >= -3 && y <= 0 && x >= -4 && x <= 4);
        if (firstRectangle || secondRectangle) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}