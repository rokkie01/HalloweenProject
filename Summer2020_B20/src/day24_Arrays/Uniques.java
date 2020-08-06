package day24_Arrays;

public class Uniques {
    public static void main(String[] args) {
        String str = "aabckjhjjkkhhkkc";

        String uniques = " "; //"b"

        for(int i = 0; i<=str.length()-1; i++){
            char ch = str.charAt(i);
            int first = str.indexOf(ch);//2
            int last = str.lastIndexOf(ch);//2

            if(first==last){
                uniques+=ch;
            }
        }
        System.out.println(uniques);
    }

}
