package day34_WrapperClasses;

import java.util.ArrayList;

public class List_MinMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(410);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(Integer each : list){
            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
