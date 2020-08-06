package day34_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String s2 = "1000000.5";
        double d2 = Double.valueOf(s2);//unboxing
        System.out.println(d2*2);

        String s3 = "FalSE";
        boolean r2 = Boolean.valueOf(s3);
        System.out.println(r2);

    }
}
