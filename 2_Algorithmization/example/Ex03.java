package example;

import java.util.Collection;

public class Ex03 {
    public static void main(String[] args) {
        // три способа объявления массивов
        int[] a1 = new int[0];
        int[] a2 = new int[]{};
        int[] a3 = {};

        // если квадратные скобки стоят перед первой переменной,
        // то они применятся ко всем переменным
        // т.е. все переменные станут массивами
        int[] ai;        // array of int
        short[][] as;        // array of array of short
        // s - не массив!
        short s, aas[][];
        Object[] ao, otherAo;   // array of Object;
        Collection<?>[] ca;  // array of Collection of unknown type

        byte[] rowvector, colvector, matrix[];
        // эквивалентно тому, что выше
        // byte rowvector[], colvector[], matrix[][];

        int a, b[], c[][];
        // эквивалентно тому, что выше
        // int a;
        // int[] b;
        // int[][] c;

        float[][] f[][], g[][][], h[];
        // эквивалентно тому, что выше
        // float[][][][] f;
        // float[][][][][] g;
        // float[][][] h;

        // в продакшне используется только вторая форма,
        // т.е. каждая переменная объявляется с новой строки
    }
}