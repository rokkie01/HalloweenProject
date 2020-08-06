package day19_ForLoop;

public class ReverseString {
    public static void main(String[] args) {
        /*String str = "Cyber";
        String result = " " + str.charAt(str.length()-1) + str.charAt(3)
                +str.charAt(2)+str.charAt(1)+str.charAt(0);

        System.out.println(result); */
        String str = "Cybertek";
        String result = "";

        for(int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);

    }
}
