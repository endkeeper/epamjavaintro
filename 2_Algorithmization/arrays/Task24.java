//Даны действительный числа. Поменять местами наибольший и наименьший элемент

public class Task24 {
    public static void main(String[] args) {
        int[] arr = {2, -3, 7, 0, 2, -1, 5, -5, 4, 0};
        int indexMin = 0;
        int min = arr[indexMin];
        int indexMax = 0;
        int max = arr[indexMax];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
        }
        arr[indexMax] = min;
        arr[indexMin] = max;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
