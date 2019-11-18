package cycles;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
 */

public class Task8 {
    public static void main(String[] args) {
        numbers(41356, 21354);
        numbers(952543, 84135);
    }

    static void numbers(int x, int y) {
        int tmp = y;
        while (x != 0) {
            int digitx = x % 10;
            while (y != 0) {
                int digity = y % 10;
                if (digitx == digity) {
                    System.out.print(" " + digitx);
                }
                y = y / 10;
            }

            x = x / 10;
            y = tmp;
        }
        System.out.println();
    }
}