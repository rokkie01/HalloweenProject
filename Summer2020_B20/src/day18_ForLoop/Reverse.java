package day18_ForLoop;

public class Reverse {
    public static void main(String[] args) {
        String str = "Python";
        //avaJ ==> ava, J

        String s1 = str.substring(1);//"ava"
        String s2 = str.substring(0,1); //"J"
        String result1 = s1+s2;
        System.out.println(result1);

    }
}
