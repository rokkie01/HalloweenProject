package day16_String;

public class String_Methods2Boolean {
    //isEmpty method(checks, if the string is empty.returns only Boolean
    public static void main(String[] args) {
        String name1 = "Cybertek";

        System.out.println(name1.isEmpty());
        String name2 = "";
        System.out.println(name2.isEmpty());

        //equals()
        String str1 = "Java";
        String str2 = new String("Java");
        System.out.println(str1 + ":"+str2);
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));

        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str3==str4);//false
        System.out.println(str3.equals(str4));//true

        String str5 = "Java";
        String str6 = "Java";

        System.out.println(str5 == str6);//true
        System.out.println(str5.equals(str6));//true

        String str7 = "Java";
        String str8 = "java";
        System.out.println(str7.equals(str8));//
        System.out.println(str7.equalsIgnoreCase(str8));
    }
}
