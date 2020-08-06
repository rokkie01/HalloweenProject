package day20_WhileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabb"; //"ab"
        //           01234
        String result = "";

        for(int i= 0; i <=str.length()-1; i++){
            String s = " " + str.charAt(i);
            if(!result.contains(s)){//if the character already contained in the result we will nor added it
                result +=s;
            }
            result +=s;
        }
        System.out.println(result);

    }
}
