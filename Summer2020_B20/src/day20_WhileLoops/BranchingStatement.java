package day20_WhileLoops;

public class BranchingStatement {
    public static void main(String[] args) {

        char ch = 'A';
        while (ch <= 'E') {
            if(ch=='C'){//will skip 'C'
                ch++;
                continue;//skips everything even the iterator
            }
            System.out.print(ch);
            ch++;
        }
    }
}
