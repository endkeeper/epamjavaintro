package cycles;

/**
 * Найдите сумму квадратов первых ста чисел
 */

public class Task3 {
    public static void main(String[] args) {
        double result = 0;
        for (int i = 1; i <= 100; i++) {
            result += Math.pow(i, 2);
        }
        System.out.println("Result is " + result);
    }
}
