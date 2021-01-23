//В массив A[n] занесены натуральные числа. Найти сумму элементов, кратных K

public class Task21 {
    public static void main(String[] args){
        int[] array={4,2,7,2,1,6,3,7,8,2,4,7};
        int sum = 0;
        int k = 2;
        for (int i=0; i<array.length; i++){
            if(array[i]%k==0){
                sum+=array[i];
            }
        }
        System.out.println("result: " + sum);
    }
}
