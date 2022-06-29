package day08_IfStatement;

public class EevenDivisible {
    public static void main(String[] args) {
        int number= 100;
        boolean divisible2= number%2==0;
        boolean divisible3= number%3==0;
        boolean divisible5= number%5==0;

        System.out.println(number +" is divisible 2: "+divisible2);
        System.out.println(number +" is divisible 3: "+divisible3);
        System.out.println(number +" is divisible 5: "+ divisible5);

    }
}
