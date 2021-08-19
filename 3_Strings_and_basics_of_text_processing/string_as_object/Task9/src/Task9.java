/*
Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.
 */

public class Task9 {
    public static void main(String[] args) {
        String str = "sdsSasdAdsDSsaqWQedsa";
        System.out.println("Upper case: " + countUpper(str));
        System.out.println("Lower case: " + countLower(str));
    }

    static int countUpper(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;
            }
            ;
        }
        return count;
    }

    static int countLower(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count++;
            }
            ;
        }
        return count;
    }
}
