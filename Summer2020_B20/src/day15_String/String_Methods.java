package day15_String;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Cybertek";
        //charAt(index)
        char ch1 = name.charAt(0);
        char ch2 = name.charAt(5);
        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("================================");
        //Lower Case of the string
        String name1 ="CYBERTEK SCHOOL";
        name1 = name1.toLowerCase();
        System.out.println(name1);
        System.out.println("=================================");

        //Upper Case of the string
        String name2 ="muhtar";
        name2 = name2.toUpperCase();
        System.out.println(name);
        System.out.println("=================================");

        //trim method. won't trim space between words
        String p = "            Cybertek School       ";
        p = p.trim();
        System.out.println(p);
        System.out.println("====================================");

    }
}
