/*
Замените в строке все вхождения 'word' на 'letter'.
 */

public class Task2 {
    public static void main(String[] args){
        String str = "dsdfsdfwordsadasdwordsadword";
        str = str.replace("word", "letter");
        System.out.println(str);
    }
}
