/*
Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.
 */

public class Task8 {
    public static void main(String[] args) {
        System.out.println(counter("test some text for testing"));
    }

    static int counter(String str) {
        int count = 0;
        int max = count;
        for (int i = 0; i < str.length(); i++) {
            while (str.charAt(i) != ' ') {
                count++;
                i++;
                if (i == str.length()) {
                    break;
                }
            }
            if (count >= max) {
                max = count;
            }
            count = 0;
        }
        return max;
    }
}
