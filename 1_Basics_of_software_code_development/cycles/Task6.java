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

    private static void symbols(String x) {
        char[] symbols = x.toCharArray();
        for (int symbol : symbols) {
            System.out.println(symbol + " in ASCII is " + symbol);
        }
        System.out.println();
    }
}
