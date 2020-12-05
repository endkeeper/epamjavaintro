/* Для данной области составить линейную программу, которая печатает true,
 * если точка с координатами (х,y) принадлежит закрашенной области, и false
 * - в противном случае */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter x,y");
        int x, y;
        x = scn.nextInt();
        y = scn.nextInt();
        boolean result = (((y >= 0 && y <= 4) && (x >= -2 && x <= 2)) || ((x >= -4 && x <= 4) && (y >= -3 && y <= 0)));
        System.out.println("Result: " + result);
    }
}
