package day09_IfStatement;

public class MinNumber {
    public static void main(String[] args) {


        int n1 = 100,
                n2 = 200;

        boolean n1Ismin= n1<n2;
        boolean n2Ismin= n2<n1;
        boolean n1Eqn2= n2==n1;
        if(n1Ismin){
            System.out.println(n1+" is the min");

        }

        if(n2Ismin){
            System.out.println(n2+" is the min");



        }
        if(n1Eqn2){
            System.out.println("equal");

        }



    }
}
