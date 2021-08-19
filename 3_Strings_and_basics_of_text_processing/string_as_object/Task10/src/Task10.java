/*
Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X.
 */

public class Task10 {
    public static void main(String[] args){
        String str = "dfsdfsd. Dsdasdsada. Sdasdas dsadasd asda. saSAdsasdasdas! dsadasds? Wweasdasd. ";
        System.out.println(counter(str));
    }

    static int counter(String str){
        int count = 0;
        for(int i =0; i<str.length(); i++){
            if (str.charAt(i)=='.' || str.charAt(i)=='!' || str.charAt(i)=='?'){
                count++;
            }
        }
        return count;
    }
}
