/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение
 * длительности в часах, минутах и секундах в формате  HHч MMмин SSс */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("seconds: ");
        int x = scn.nextInt();
        int hours, minutes, seconds;
        hours = x/3600;
        minutes=(x%3600)/60;
        seconds = (x%3600)%60;
        System.out.println(hours+"h "+minutes+"m "+seconds+"s");
    }
}
