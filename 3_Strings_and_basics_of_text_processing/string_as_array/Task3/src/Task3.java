/*
 В строке найти количество цифр.
 */

public class Task3 {
    public static void main(String[] args) {
        System.out.println(numbers("sdfasdasd23saxd2112sad1300"));
    }

    static int numbers(String str) {
        int count = 0;
        char[] array = str.toCharArray();
        for (int i=0; i<array.length; i++){
            if (array[i]>='0' && array[i]<='9'){
                count++;
            }
        }
        return count;
    }
}
