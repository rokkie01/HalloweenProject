package Practice;

public class Practice {
    public static void main(String[] args) {

        String[]words = {"funky", "monkey", "day", "night"};

        for(String w: words){
            if(w.endsWith("y")){
                System.out.println(w+" end with y");
            }
            String s = "buckyrobertsbuckyroberts";
            System.out.println(s.indexOf('o',10));
        }
    }
}
