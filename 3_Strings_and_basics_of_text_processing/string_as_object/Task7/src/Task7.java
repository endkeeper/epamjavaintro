/*
Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
def", то должно быть выведено "abcdef".
 */

public class Task7 {
    public static void main(String[] args){
        System.out.println(newString("sd dsds dsaqd sad"));
    }

    static String newString(String str){
        String newString ="";
        boolean check = false;
        newString+=str.charAt(0);
        for(int i = 1; i<str.length(); i++){
            for(int j=0;j<newString.length(); j++){
                if(str.charAt(i)==newString.charAt(j) || str.charAt(i) == ' '){
                    check = true;
                    break;
                }
            }
            if (check == false){
                newString+=str.charAt(i);
            } else {
                check = false;
            }
        }
        return newString;
    }
}
