package cycles;

/**
 * Найдите сумму квадратов первых ста чисел
 */

public class Task3 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int a = i;
            int b = i + 1;
            double result = Math.pow(a, 2) + Math.pow(b, 2);
            System.out.println("Result for numbers a " + a + " and b " + b + " is " + result);
        }
    }
}
