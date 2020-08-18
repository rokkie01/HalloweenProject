package day41_toString;

import java.util.ArrayList;

public class CatObjects {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setCatInfo("Cass", 2, 'F', "Black", "Persian");
        System.out.println( cat1 );

        Cat [] catPark = {cat1, new Cat(), new Cat(), new Cat(), new Cat()};
        catPark [1].setCatInfo("Puki", 3,'M', "Orange", "Abbyss");
        catPark [2].setCatInfo("Miaw", 5, 'F', "White","Persian");
        catPark [3].setCatInfo("Jean", 2, 'F', "Grey", "Persian");
        catPark [4].setCatInfo("Lord", 8, 'F', "Blue", "Persian");
        for(Cat each: catPark){
            System.out.println(each);
            System.out.println("===========================");

            ArrayList<Cat> femaleCats = new ArrayList<>();
            ArrayList<Cat> maleCats = new ArrayList <>();

            for(int i=0; i<=catPark.length-1; i++){
                if(catPark[i].gender =='M'){
                    maleCats.add(catPark[i]);
                }else{
                    femaleCats.add(catPark[i]);
                }
            }
            System.out.println(femaleCats);
            System.out.println(maleCats);
        }
    }
}

