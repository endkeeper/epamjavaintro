/**
 * Найти max{min(a,b), min(c,d)}
 */

public class Task2 {
    public static void main(String[] args) {
        result(4, 3, 1, 4);
    }

    private static void result(int a, int b, int c, int d) {
        int min1;
        int min2;
        int max;

        if (a > b) {
            min1 = b;
        } else {
            min1 = a;
        }

        if (c > d) {
            min2 = d;
        } else {
            min2 = c;
        }

        if (min2 > min1) {
            max = min2;
        } else {
            max = min1;
        }

        System.out.println("result is " + max);
    }
}
