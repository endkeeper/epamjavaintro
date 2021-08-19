/*
С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */

public class Task4 {
    public static void main(String[] args) {
        System.out.println(word("информатика"));
    }

    static String word(String str) {
        String word = "";
        word += str.charAt(7);
        word += str.charAt(3);
        word += str.charAt(4);
        word += str.charAt(7);
        return word;
    }
}
