/*
Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class Task5 {
    public static void main(String[] args){
        System.out.println(count("sfdadfsdasdwqaeqwea"));
    }

    static int count(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        return count;
    }
}
