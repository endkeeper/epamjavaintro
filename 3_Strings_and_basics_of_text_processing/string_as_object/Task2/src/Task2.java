/*
В строке вставить после каждого символа 'a' символ 'b'.
 */

public class Task2 {
    public static void main(String[] args) {
        System.out.println(edit("sdsdasddsfasdweadsaadsdsadsdsw"));
    }

    static String edit(String str) {
        String newString = "";
        newString = str.replace("a", "ab");
        return newString;
    }
}
