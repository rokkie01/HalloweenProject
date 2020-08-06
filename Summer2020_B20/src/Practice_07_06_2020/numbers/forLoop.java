package Practice_07_06_2020.numbers;

public class forLoop {
    public static void main(String[] args) {
        for(int i=1; i<=100;i++){
            if(i%3==0){// number 3 will be shipped, when continue is used
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
