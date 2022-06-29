package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name= "Omer";
        int age=19;
        String citizen= "Uk";

        boolean isEligible = age >=18  && citizen == "USA";
        System.out.println(name + " is eligible to vote: "+ isEligible);
String name2= "kk";
int creditScore=720;
int age2=23;
boolean isEligible2=creditScore>=700 && age2>=22;
        System.out.println(name2+ " is eligible for loan: "+isEligible2);

 String name3="uy";
int age3=21;
 char gender = 'F';



 boolean isEligible3= age3>= 18 && (gender== 'M' || gender=='F' );
        System.out.println(name3+" is eligible : "+ isEligible3);


     String name4="James";
     String countryOfBirth= "USA";
     boolean marriedToUsCitizen= false;
     boolean isEligible4= countryOfBirth=="USA" || marriedToUsCitizen== true;

        System.out.println(name4+ " is eligible : "+isEligible4);


        String student= "Anna";
        double gpa=3.5;
        int familyIncome=10000;

        boolean isEligible5= gpa>=3.5 || familyIncome<=6000;

        System.out.println(student+" is eligible : "+isEligible5);



    }

}
