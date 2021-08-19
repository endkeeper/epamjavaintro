/*
В строке найти количество чисел.
 */

public class Task4 {
    public static void main(String[] args){
        System.out.println(numbers("134dsfsdf43143dsaf432sfdf1sdf234fds43f2a523d4"));
    }

    static int numbers(String str){
        int count = 0;
        char[] array = str.toCharArray();
        for (int i=0; i<array.length-1; i++){
            if(array[i]>='0' && array[i]<='9'){
                if(array[i+1]>='0' && array[i+1]<='9'){

                } else {
                    count++;
                }
            }
        }
        if (array[array.length-1]>='0' && array[array.length-1]<='9'){
            count++;
        }
        return count;
    }
}
