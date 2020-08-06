package Practice;

import java.util.ArrayList;

/*write a program that can set the last element of the Integer arraylist to zero
        ex:
        list = [1,2,3,4,5];
        output: [1,2,3,4,0]; */
public class WarmUp728 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        num.set(4,0);

        System.out.println(num);
        System.out.println("=====================================");

        ArrayList<Integer> num1 = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        num.set(4,0);

        System.out.println(num);
        System.out.println("=====================================");


    }
}
