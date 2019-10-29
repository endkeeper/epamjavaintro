/* Для данной области составить линейную программу, которая печатает true,
если точка с координатами (х,y) принадлежит закрашенной области, и false
- в противном случае
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Inset (x,y)");
        int x = scn.nextInt();
        int y = scn.nextInt();

        if (y >= -3 && y <= 4 && x >= -2 && x <= 2)||(y >= -3 && y <= 0 && x >= -4 && x <= 4) {
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}