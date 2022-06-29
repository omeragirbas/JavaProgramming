package day08_IfStatement;

public class NumberOfDays {
    public static void main(String[] args) {
        int number=5;
        boolean has28days= number==2;
        boolean has30days= number==4 || number==9 || number==6 || number==11;
        boolean has31days= !has28days && !has30days;
        if(has28days){
            System.out.println("has28days ");

        }
        if(has30days){
            System.out.println("has31days  ");

        }
        if(has31days){
            System.out.println("has31days  ");

        }
    }

}
