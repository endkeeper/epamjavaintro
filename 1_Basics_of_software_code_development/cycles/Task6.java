package cycles;

/**
 * Вывести на экран соответствия между символами и их численными обозначениями в памяти компьютера
 */

public class Task6 {
    public static void main(String[] args) {
        symbols("13123");
        symbols("sadasdqw");
        symbols("$#@^@#esd312");
    }

    static void symbols(String x) {
        char[] symbols = x.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            int result = (int) symbols[i];
            System.out.println(symbols[i] + " in ASCII is " + result);
        }
        System.out.println();
    }
}
