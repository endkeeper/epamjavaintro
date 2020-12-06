//Найти max{min(a,b), min(c,d};

import java.util.Scanner;

public class Task2 {
    public static void main() {
        Scanner scn = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Enter a,b,c,d");
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();
        d = scn.nextInt();
        int var1, var2, result;
        if (a > b) {
            var1 = b;
        } else {
            var1 = a;
        }
        if (c > d) {
            var2 = d;
        } else {
            var2 = c;
        }
        if (var1 > var2) {
            result = var1;
        } else {
            result = var2;
        }
        System.out.println("Result: "+ result);
    }
}
