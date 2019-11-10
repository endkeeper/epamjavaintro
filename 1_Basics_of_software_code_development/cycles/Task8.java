package cycles;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
 */

public class Task8 {
    public static void main(String[] args) {
        numbers(11, 2);
        numbers(-15, 4);
        numbers(15432, -41232);
        numbers(5342, 0);
    }

    static void numbers(int x, int y) {
        if (x < 0) {
            x *= -1;
        }
        String lng1 = "" + x;
        for (int i = 0; i < lng1.length(); i++) {
            int resultx;
            resultx = x % 10;
            System.out.print(resultx);
            x = x / 10;
        }
        System.out.print(" --- ");
        if (y < 0) {
            y *= -1;
        }
        String lng2 = "" + y;
        for (int i = 0; i < lng2.length(); i++) {
            int resulty;
            resulty = y % 10;
            System.out.print(resulty);
            y = y / 10;
        }
        System.out.println();
    }

}