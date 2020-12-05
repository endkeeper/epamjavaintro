//Дано действительное число R вида  nnn.ddd. Поменять местами дробную и целую часть

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double number;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter variable nnn.ddd");
        number = scn.nextDouble();
        int var1, var2;
        var1 = (int) number;
        var2 = (int) (number * 1000) % 1000;
        System.out.println("Result: " + var2 + "." + var1);
    }
}