/*
Даны два числа, определить цифры, входящий в состав как первого, так и второго числа.
 */

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        int a, b;
        a = 7231;
        b = 234088887;
        compare(a, b);
    }

    static void compare(int a, int b) {
        ArrayList listA = new ArrayList();
        ArrayList listB = new ArrayList();
        ArrayList result = new ArrayList();
        while (a > 0) {
            listA.add(a % 10);
            a /= 10;
        }
        while (b > 0) {
            listB.add(b % 10);
            b /= 10;
        }
        for (int i = 0; i < listA.size(); i++) {
            for (int j = 0; j < listB.size(); j++) {
                if(listA.get(i)==listB.get(j)){
                    result.add(listA.get(i));
                    for(int x = 0; x<listA.size(); x++ ){
                        listA.remove(listB.get(j));
                    }
                }
            }
        }
        System.out.println("Same: ");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}