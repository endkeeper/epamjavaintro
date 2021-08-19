/*
Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.println(counter("    sda   sadasd asdasd  asdd"));
    }

    static int counter(String str) {
        int count = 1;
        int max = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ') {
                if (str.charAt(i+1) == ' ') {
                    count++;
                } else {
                    if (max <= count) {
                        max = count;
                        count = 1;
                    }
                }
            }
        }
        return max;

    }
}
