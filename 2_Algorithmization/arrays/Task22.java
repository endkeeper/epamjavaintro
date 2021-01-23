//Дана последовательность действительных чисел. Заменить все ее члены, больше данного Z этим числом и посчитать количество замен

public class Task22 {
    public static void main(String args[]) {
        int[] array = {4, 5, 2, 7, 5, 3, 2, 6, 7, 8, 3, 2, 1};
        int z = 5;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>z){
                array[i]=z;
                count++;
            }
        }
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+ "  ");
        }
        System.out.println();
        System.out.print("repeats: "+count);
    }
}
