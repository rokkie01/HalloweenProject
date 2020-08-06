package Practice;
//division without / operator
public class Practice4_GroupMeeting {
    public static void main(String[] args) {
        /* 10/3= 3;
        10-3=7
        7-3=4
        4-3=1
         */
     int a = 10;
     int b =0;
     int count =0;

     if(b==0) {
         System.out.println("Invalid");
         System.exit(0);
     }
     while(a>=b){
         a -=b;
         count++;
     }
        System.out.println(count+ " with a remainder of "+ a);

    }
}
