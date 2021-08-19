/*
Проверить, является ли заданное слово палиндромом.
 */

public class Task3 {
    public static void main(String[] args) {
        check("pop");
    }

    static void check(String str) {
        StringBuffer string = new StringBuffer(str);
        StringBuffer tmp = new StringBuffer(string.reverse());
        System.out.println(string);
        System.out.println(tmp);
        if (tmp.toString().equals(string.toString())) {
            System.out.println("polynomial");
        } else {
            System.out.println("not polynomial");
        }
    }
}
