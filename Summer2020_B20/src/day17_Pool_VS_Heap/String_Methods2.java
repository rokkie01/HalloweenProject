package day17_Pool_VS_Heap;

public class String_Methods2 {
    public static void main(String[] args) {

        String s1 = "Cat";//String pool
        String s2 = new String("Cat");//heap
        String s3 = new String("Cat");

        //equals is case sensitive
        System.out.println(s1==s2);         //false
        System.out.println(s1.equals(s2));  //true
        System.out.println(s2 == s3);       //false
        System.out.println(s2.equals(s3));  //true
        //
        String s4 = "java";
        String s5 = "Java";
        System.out.println(s4.equalsIgnoreCase(s5));

        String s6 = "Muhtar";
        String s7 = "muhtar";
        System.out.println(s6.equalsIgnoreCase(s7));

        //isEmpty: checks if the length of string is o

        String str = " ";
        System.out.println(str.isEmpty());  //false

        str = str.trim(); //""
        System.out.println(str.isEmpty());  //true

        String str2 = "Cybertek";
        System.out.println(str2.isEmpty());//false

        System.out.println(s4.equals(s5));  //false
        System.out.println(s4==s5);         //false

        System.out.println(s4.equalsIgnoreCase(s5));//true

        //contains: included or not

        String str3 = "Java,C#, Python, Ruby, C++";
        System.out.println(str3.contains("Java"));//true
        System.out.println(str3.contains("java"));
        //System.out.println(str3.toLowerCase().contains("java"));

        String str4 = "ABCD";
        System.out.println(str4.contains("D"));

        //startsWith & endsWith:
        String str5 = "Cybertek";
        System.out.println(str5.startsWith("Cyber"));
        System.out.println(str5.startsWith("E") || str5.startsWith("C"));
        //                      false           || true ==> true
        System.out.println(str5.startsWith("CybABC"));//false
        String str6 = "Today is a great day";
        System.out.println(str6.endsWith("day"));//true
        System.out.println(str6.endsWith("great"));//false




    }
}
