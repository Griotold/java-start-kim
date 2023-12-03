package start.condition.ex;
//        90점 이상: "A"
//        80점 이상 90점 미만: "B"
//        70점 이상 80점 미만: "C"
//        60점 이상 70점 미만: "D"
//        60점 미만: "F"
public class ScoreEx {

    public static void main(String[] args) {
        int score = 55;
        String grade = "";
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.printf("학점은 %s입니다", grade);
    }
}
