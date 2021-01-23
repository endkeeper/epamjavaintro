import java.util.ArrayList;

/*
Дана последовательность чисел. Образовать новую последовательность, выбросив из исходной те члены, которые равны
min(последовательность)
 */
public class Task28 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 5, 6, 2, 65, 3, 1, 45, 5, 6, 7, 2};
        int iMin = 0;
        int min = arr[iMin];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        ArrayList newArr = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                newArr.add(arr[i]);
            }
        }
        for (int i = 0; i < newArr.size(); i++) {
            System.out.print(newArr.get(i) + "  ");
        }
    }
}
