//Заданы размеры A,B прямоугольного отверстия и размеры x,y,z кирпича. Пройдет ли кирпич в отверстие

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b, x, y, z;
        System.out.println("size of rectangle: ");
        a = scn.nextInt();
        b = scn.nextInt();
        System.out.println("size of break");
        x = scn.nextInt();
        y = scn.nextInt();
        z = scn.nextInt();
        boolean firstSide, secondSide, thirdSide;
        firstSide = (y <= a && x <= b);
        secondSide = (z <= b && y <= a);
        thirdSide = (z <= a && x <= b);
        if (firstSide || secondSide || thirdSide) {
            System.out.println("break can go through rectangle");
        } else {
            System.out.println("break can't go through rectangle");
        }
    }
}
