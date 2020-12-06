/*
Вывести на экран соответствие между символами и их численным обозначением в памяти компьютера
 */

public class Task6 {
    public static void main(String[] args) {
        conformnity("Something about arrays");
    }

    static void conformnity(String text) {
        char[] symbols = text.toCharArray();
        int index;
        for (int i = 0; i < symbols.length; i++) {
            index = symbols[i];
            System.out.println(symbols[i] + " - " + index);
        }
    }

}
