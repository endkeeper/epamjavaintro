/*
Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */

public class Task5 {
    public static void main(String[] args) {
        System.out.println(newString("  sdfdsf    fsdfsd  f dfsdf  fsdf  fsdf dsf sfd "));
    }

    static String newString(String str) {
        String newString = "";
        int count = 0;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length - 1; i++) {
            while (array[i] == ' ') {
                count++;
                i++;
            }
            break;
        }
        for (int i = count; i < array.length - 1; i++) {
            if (array[i] == ' ') {
                if (array[i + 1] == ' ') {
                    continue;
                }

            }
            newString += array[i];
        }
        return newString;
    }
}
