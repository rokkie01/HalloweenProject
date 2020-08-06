package day35_ArrayList;

import java.util.ArrayList;

public class ReversedOrder {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);//0
        list.add(20);//1
        list.add(1, 30);//2 adding index. updated it 1
        list.add(40);//3
        list.add(50);//4
        System.out.println(list.size());

        for (int i = list.size()-1; i>=0; i--){
            System.out.println(list.get(i)+" ");
        }
    }
}
