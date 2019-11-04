package branching;

import java.util.Scanner;

/**
*Заданы размеры А,В прямоугольного отверстия и размеры x,y,z кирпича. Определить, пройдет ли кирпич через отверстие
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of hole");
        int A = scn.nextInt();
        int B = scn.nextInt();
        System.out.println("Enter size of brick");
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        boolean pos1 = A >= x && B >= y;
        boolean pos2 = A >= z && B >= y;
        boolean pos3 = A >= y && B >= z;
        if (pos1 || pos2 || pos3) {
            System.out.println("Brick can go through the hole");
        } else {
            System.out.println("Brick cant go through the hole");
        }
    }
}