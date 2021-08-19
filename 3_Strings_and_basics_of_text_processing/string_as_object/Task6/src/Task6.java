/*
Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Task6 {
    public static void main(String[] args){
        System.out.println(newString("sdsasd"));
    }

    static String newString(String str){
        String newString = "";
        for(int i=0; i<str.length(); i++){
            newString+=str.charAt(i);
            newString+=str.charAt(i);
        }
        return newString;
    }
}
