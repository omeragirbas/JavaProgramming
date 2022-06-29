package day10NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int s=45;
        /*if(s>=0 && s<=100){


        }else
            System.out.println("ınvalid");
*/
     String resul=   (s>=0&& s<=100)? (s>=60)?"passed": "failed":"ınvalıd score";
        System.out.println(resul);

    }
}
