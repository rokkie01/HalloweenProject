package Office_Hours.Practice_06_30_2020;

public class nestedIf {
    public static void main(String[] args) {
        int score = 65;
        char grade = ' ';

        if (score >= 0 && score <= 100) {
            if (score >= 90 && score <= 100) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
        } else {
            grade = 'I';
        }
    }
}
