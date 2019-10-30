// Вычислить значение выражения по формуле(все переменные принимают действительные значения)
// (sinx + cosy)/(cosx-siny)*tgxy

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Insert x,y");
        int x = scn.nextInt();
        int y = scn.nextInt();
        double Result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.printf("Result: " + "%.1f", Result);
    }
}
