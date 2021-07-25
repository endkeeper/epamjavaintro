/*
Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        String[] array = {"dsadSdsad", "sdsadSaadSasdw", "saaDsadDfsaAdasd"};
        char[] symbols;
        int n = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            symbols = array[i].toCharArray();
            for (int j = 0; j < symbols.length; j++) {
                if (symbols[j] >= 'A' && symbols[j] <= 'Z') {
                    n++;
                }
            }
            char[] symbolsNew = new char[symbols.length + n];
            n = 0;
            for (int j = 0; j < symbols.length; j++) {
                if (symbols[j] >= 'A' && symbols[j] <= 'Z') {
                    count++;
                    symbolsNew[j + count] = symbols[j];
                    symbolsNew[j + count-1] = '_';
                } else {
                    symbolsNew[j + count] = symbols[j];
                }
            }
            String tmp = new String(symbolsNew);
            array[i] = tmp.toLowerCase(Locale.ROOT);
            count = 0;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
