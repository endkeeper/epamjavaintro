/**
 * Вычислить значение функции
 */

public class Task5 {
    public static void main(String[] args) {
        function(1);
    }

    private static void function(int x) {
        double result;
        if (x <= 3) {
            result = Math.pow(x, 2) - 3 * x + 9;
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("result is " + result);
    }
}
