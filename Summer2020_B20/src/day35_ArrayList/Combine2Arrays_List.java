package day35_ArrayList;

import java.util.ArrayList;

public class Combine2Arrays_List {
    public static void main(String[] args) {

        String[] group1 = {"Aalia", "Mohammed", "Aslan", "Ernis"};
        String[] group2 = {"Zarina", "Mee", "Irina", "Virginia", "Ali", "Dawud"};

        ArrayList<String> studentList = new ArrayList<String>();

        for(String each: group1){
            studentList.add(each);
        }
        for(String each:group2){
            studentList.add(each);
        }
        System.out.println(studentList);
    }
}
