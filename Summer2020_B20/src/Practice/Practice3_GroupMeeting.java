package Practice;

public class Practice3_GroupMeeting {
    public static void main(String[] args) {
        int num = 6435;
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(rev);
    }
}


