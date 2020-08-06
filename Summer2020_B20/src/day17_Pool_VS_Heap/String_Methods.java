package day17_Pool_VS_Heap;

public class String_Methods {
    public static void main(String[] args) {
        //charAt(index); ==> char ==> returns positions of the letter
        String str = "Cybertek";
        //IndexOf     012345678
        char ch1 = str.charAt(1);
        System.out.println(ch1);
        System.out.println("======================================");

        //+: concat
        String str2 = "Cybertek";
              str2 =  str2 + " School";
        System.out.println(str2);
        System.out.println("=====================================");

        //length() ==> returns int
        String str3 = "Cybertek School";
        int l = str.length();//15
        System.out.println(l);
        System.out.println("=====================================");

        // lastIndex: length-1
        char ch2 = str3.charAt(l-1);//str3.length()-1
        System.out.println(ch2);
        System.out.println("last index: "+(l-1));

        //upperCase & lowerCase

        String str4 = "cybertek";
        str4 = str4.toUpperCase();//it will never create a new string, but create new
        System.out.println(str4);

        String str5 = "JAVA";
        str5=str5.toLowerCase();
        System.out.println(str5);

        //trim() ==> removes unused spaces
        String str6 = "         Cybertek    ";
        System.out.println(str6);

        str6 = str6.trim();//"Cybertek"
        System.out.println(str6);

        //substring
        String str7 = "I like Java Language ";
        //              012345678910
        String word = str7.substring(7,11);
        System.out.println(word);

        String word2 = str7.substring(12);//if there is only index it will print from 12 until the end
        System.out.println(word2);

        //indexOf & lastIndexOf ==> returns int

        String str8 = "Hello Batch 20, Have a Wonderful day";
        int i1 = str8.indexOf("W");
        System.out.println(i1);
        System.out.println(str8.charAt(i1));

        int i2 = str8.indexOf(", W")+2;
        int i3 = str8.indexOf("J");

        String str9 = "Java Java Java";
        int i4 = str9.lastIndexOf("J");
        int i5 = str9.indexOf("J");

        int i6 = str9.indexOf(" Java ")+1;
        int i7 = str9.lastIndexOf("Java");

        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);

        //replace & replaceFirst
        String s1 = "I like Java, Java is a programming language";
        s1=s1.replace("Java", "C#");
        System.out.println(s1);

        String s2 = "I like Java, Java is a programming language";
        s2=s2.replaceFirst("Java", "C#");
        System.out.println(s2);

        String s3 = "I like Java, Java is a programming language";
        s3 = s3.replace("Java is", "C# is");

        






    }
}
