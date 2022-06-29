package day08_IfStatement;

public class GreatReort {
    public static void main(String[] args) {
int score= 85;
boolean excellent= score>=90 && score<=100;
boolean great= score>=80 && score<=89;
boolean good= score>=70&& score<=79;
boolean passed= score>=60 && score<=69;
boolean failed= score>=0 && score<=59;
        if(excellent){
            System.out.println("excellent " );

        }
        if(great){
            System.out.println("great  " );

        }
        if(good){
            System.out.println("good");

        }
        if(passed){
            System.out.println("passed");

        }
        if(failed){
            System.out.println("failed");

        }
    }
}
