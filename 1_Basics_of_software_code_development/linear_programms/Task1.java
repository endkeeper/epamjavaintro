import java.util.Scanner;

/*
Найдите значение функции z = ( (a - 3) * b / 2 ) + c
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите a");
        int a = scn.nextInt();
        System.out.println("Введите b");
        int b = scn.nextInt();
        System.out.println("Введите c");
        int c = scn.nextInt();
        float z = ((a - 3) * b / 2) + c;
        System.out.printf("Ответ: " + "%.1f", z);
    }
}
