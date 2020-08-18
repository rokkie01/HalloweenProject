package day39_CustomClass;

public class dogObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDogInfo("Leopard", "Beagel", "Medium", 2, "Mix");
        dog2.setDogInfo("Roofus", "Dogo", "Large", 1, "White");
        dog3.setDogInfo("Jelly", "Kelly", "Small", 1, "Grey");

        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

        dog1.eat ("Kelle Paca");
        dog2.eat ("Steak");
        dog3.eat ("Jelly");

        dog3.drink("cola");
        dog1.drink("milk");
        dog2.drink("water");

        dog1.sleep();
        dog2.sleep();
        dog3.sleep();


    }
}
