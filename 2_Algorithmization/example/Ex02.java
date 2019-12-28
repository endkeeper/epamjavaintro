package example;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        // приведение типов
        Object[] a = new Integer[]{1, 2, 3};
        Integer[] b = (Integer[]) a;
        System.out.println(Arrays.toString(b));

        Object[] t = new String[]{"String"};
        // ошибка в рантайме
        Integer[] z = (Integer[]) t;
    }
}