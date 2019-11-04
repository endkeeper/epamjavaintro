package cycles;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
 */

public class Task8 {
    public static void main(String[] args) {
        numbers(10, 2);
        numbers(-10, 4);
        numbers(15432, -41232);
        numbers(5342, 0);
    }

    static void numbers(int x, int y) {
        String firstNumber = "" + x;
        String secondNumber = "" + y;

        for (int i = 1; i <= firstNumber.length(); i++) {
            System.out.println(i + " number of first figure: " + firstNumber.charAt(firstNumber.length() - i));
        }
        System.out.println();
        for (int i = 1; i <= secondNumber.length(); i++) {
            System.out.println(i + " number of second figure: " + secondNumber.charAt(secondNumber.length() - i));
        }

    }
}
