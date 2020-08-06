package Interview;
public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "ababababbababacccccccccddddddddeeeee";

        String nonDup = "";//"ab"

        for (String each: str.split("")){
            if(!nonDup.contains(each)){
                nonDup +=each;
            }
        }
        System.out.println(nonDup);

    }
}
