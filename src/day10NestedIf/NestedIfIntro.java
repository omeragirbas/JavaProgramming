package day10NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 195;
        if(score>=0 && score<=100){ //if the score is valid
        if (score >= 60) {
            System.out.println("Passed");

        }else {
            System.out.println("Fail");
        }
        }else{
            System.out.println("not valid score");

        }
    }
}
