package day08_IfStatement;

public class EligibleVote {
    public static void main(String[] args) {
        String name = "Omer";
        int age=38;
        String citizien= "USA";

        boolean isEligible= age>=21  && citizien=="USA";

        //ELIGIBLE
        if(isEligible){
            System.out.println("Eligible");

        }
        //NOT ELIGIBLE
        if(!isEligible){
            System.out.println("not eligible");

        }
    }
}
