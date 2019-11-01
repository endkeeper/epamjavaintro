package linear_programms;

import java.util.Scanner;

/**
 * Дано действительное натуральное число R вида nnn.ddd(три цифровых разряда
 * в дробно и целой частях). Поменять местами дробную и целую части числа и вывести
 * полученное значение числа
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Insert number format xxx,yyy");
        float number = scn.nextFloat();
        float newNumber = (int) number;
        newNumber /= 1000;
        float tmp = (number * 1000) % 1000;
        newNumber += tmp;
        System.out.println("Result: " + newNumber);
    }
}
