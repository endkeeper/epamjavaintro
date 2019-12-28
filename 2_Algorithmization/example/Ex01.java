package example;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        int[] b = {1, 2, 3};
        // массив это объект, а не примитив
        System.out.println("equals " + a.equals(b));
        System.out.println("self equals  " + a.equals(a));
        System.out.println("a hashcode " + a.hashCode());
        System.out.println("b hashcode " + b.hashCode());
        System.out.println(a.getClass());
        System.out.println(a.getClass().getSuperclass());

        // клонирование
        int[] aCloned = a.clone();
        System.out.println(a == aCloned);
        aCloned[0] = 4;
        a[0] = 5;
        System.out.println("original " + Arrays.toString(a));
        System.out.println("cloned " + Arrays.toString(aCloned));

        int c[][] = {{1, 2}, null};
        int d[][] = c.clone();
        System.out.print(c == d);
        System.out.println(c[0] == d[0] && c[1] == d[1]);

        System.out.println("original " + Arrays.deepToString(c));
        System.out.println("cloned " + Arrays.deepToString(d));
        // максимальная длина массива, скомпилируется, но упадёт в рантайме по памяти
        // long[] x = new long[Integer.MAX_VALUE];
        // ошибка компиляции, так как Long.MAX_VALUE > Integer.MAX_VALUE
        // int[] error = new int[Long.MAX_VALUE];

        // массив нулевой длины
        System.out.println(new int[]{}.length);
        System.out.println(new int[0].length);
    }
}