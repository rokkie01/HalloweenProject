package Office_Hours.Practice_07_15_2020;

public class FrequencyOfWords {
    public static void main(String[] args) {
        String str = "cat cat dog cat";

        int countofCat =0;
        int countofDog =0;

        if(str.contains("cat")){
            str = str.replace("dog", "");
            countofDog++;
        }
        if(str.contains("cat")){
            countofCat++;
            str=str.replaceFirst("cat", "");
        }
        System.out.println("Dog: "+countofDog);
        System.out.println("Cat:"+countofCat);
    }
}
