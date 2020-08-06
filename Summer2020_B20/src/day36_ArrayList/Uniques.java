package day36_ArrayList;
import java.util.ArrayList;

public class Uniques {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        ArrayList<Integer> uniques = new ArrayList<>();

        Integer element = list.get(0);//whenever it is not a match with every element increase the count by 1
        int count =0;
        for(Integer each:list){
            if(each==element){//finds the frequency of element
                count++;
            }
        }
        if(count==1){//to verify if element is unique
            uniques.add(element);
        }
        System.out.println(count);

    }
}
