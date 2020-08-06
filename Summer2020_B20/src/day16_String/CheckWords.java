package day16_String;
/*  String firstName, lastName, fullName, email, street, state,city, address, contacts;
  int age, zipcode;
  double height, weight;
  boolean isMarried = true;
  long workPhoneNumber, personalPhoneNumber; */

public class CheckWords {
    public static void main(String[] args) {
        String str = "I like java";
        //last index = length-1
        //second last index = length -2
        //third last index = length -3
        if (str.length() == 0) {
            System.out.println("empty string");
        } else if (str.length() > 3) {
            System.out.println(str.substring(str.length() - 3));
        } else {
            System.out.println(str);
        }
        String result = (str.length() == 0) ? "empty string" :
                (str.length() > 3) ? str.substring(str.length() - 3) : str;
        System.out.println(result);
        System.out.println("=====================================");
        String str1 = "abcd";
        String str2 = "ab";
        String str3 = "abc";

    }
}
