package day09_IfStatement;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;

        boolean leapYear= year %4==0;

        if(leapYear) {
            System.out.println("year"+year);


        }
        if(!leapYear){
            System.out.println("year"+year+"not");


        }

        System.out.println("---------------------");

        if(leapYear){
            System.out.println("yes");

        }else{
            System.out.println("nno");

        }


    }
}
