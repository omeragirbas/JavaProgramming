package day10NestedIf;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        String result="";  //temporary
        Scanner scan=new Scanner(System.in);
        System.out.println("Please write your scroe");
        int score=scan.nextInt();
        if(score >=0 && score<=100){
            if(score>=90 && score<=100){ // 2. satırları yazmana gerek yok
                result = "Excellent";
                //System.out.println("Excellent");
            }else if(score>=80 && score<=89){
                result= "Great";
                //System.out.println("Great");
            }else if(score>=70 && score<=79){
                result= "Good";
                //System.out.println("good");
            }else if (score>=90 && score<=69){
                result="passed";
                //System.out.println("passed");
            }else{
                result="fail";
                //System.out.println("fail");
            }

        }else {
            result = "Score is not valid";
        }
        System.out.println(result);
    }
}
