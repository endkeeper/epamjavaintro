package cycles;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел
 */

public class Task4 {
    public static void main(String[] args) {
        double result = 1;
        for (int i = 1; i <= 200; i++) {
            result *= Math.pow(i, 2);
            System.out.println("Result is " + result);
        }
    }
}
