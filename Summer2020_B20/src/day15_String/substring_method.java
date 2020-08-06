package day15_String;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;


public class substring_method {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        //                 0123456789...
        //substring(beg index, end index)
        String word1 = sentence.substring(0, 7);

        System.out.println(word1);

        String word2 = sentence.substring(8, 11);
        System.out.println(word2);

        System.out.println("=================================");

        String sentence2 = "I lime Movies and TV Series";
        //                  0123456789....
        String word3 = sentence2.substring(7, 13);
        System.out.println(word3);

        System.out.println("====================================");
        String firstName = "cRistina";
        String firstCharacter = firstName.substring(0, 1);
        String rest = firstName.substring(1, firstName.length());

        firstName = firstCharacter.toUpperCase()+ rest.toLowerCase();
        System.out.println(firstName);

        System.out.println("=======================================");
        String lastName = "school";
        String firstChar = lastName.substring(0,1);
        String remaining = lastName.substring(1);
        System.out.println(firstChar);
        System.out.println(remaining);

        lastName = firstChar.toUpperCase()+remaining.toLowerCase();
        System.out.println(lastName);

        System.out.println("========================================");

        String s = "I like Game of Thrones";
        //             01234567
        String series = s.substring(7);
        System.out.println(series);

        String s2 = "I like Java Programming";
        //          0123456789
        String language = s2.substring(7);
        System.out.println(language);

    }
}
