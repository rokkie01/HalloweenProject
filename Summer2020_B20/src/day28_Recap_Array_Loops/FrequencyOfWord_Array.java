package day28_Recap_Array_Loops;

public class FrequencyOfWord_Array {
    public static void main(String[] args) {

    String[] arr = {"Java", "C#", "Python", "Java","jaVa"};
    String word = "Java";

    int count = 0;

    for(String each:arr){
        if(!word.equalsIgnoreCase(each)){
            continue; //if the word doesn't match, it will skip it
        }
        count++;//if it matches, it will add one to the count
    }
        System.out.println(count);

    }
}
