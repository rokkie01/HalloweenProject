package Practice_07_28_2020;

public class Method_Practice {
    public static void main(String[] args) {
        String name = "Ibrahim";
        String reversedName = reverseStr(name);
        System.out.println(reverseStr(name));
        System.out.println(reversedName.toUpperCase());
        isPalindrome("Irene");
    }

    public static String reverseStr(String str) {//"ABC"
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void isPalindrome(String str) {//ABC
        String reverseStr = reverseStr(str);//CBA
        boolean palindrome = str.equalsIgnoreCase(reverseStr);

        System.out.println(palindrome?"Is Palindrome":"Isn't Palindrome");
    }
}




