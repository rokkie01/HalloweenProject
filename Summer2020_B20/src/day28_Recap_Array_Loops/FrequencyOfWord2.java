package day28_Recap_Array_Loops;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

    String str = "catcatcatdogdog";
    int count = 0; //"cat"

    for(int i=0;i<=str.length()-3; i++){
       if(str.substring(i,i+3).equals("cat")){
        count++;
    }
}
        System.out.println(count);
    }
}
