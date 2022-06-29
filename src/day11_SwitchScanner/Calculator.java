package day11_SwitchScanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double n1=10.5, n2=20.2;
        Scanner scan=new Scanner(System.in);

        char operator='(';
        boolean valid=operator =='+' || operator=='-' || operator == '/' || operator=='*';
        if(valid){
            switch (operator){
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                default:
                    System.out.println(n1/n2);

            }

        }else{
            System.out.println("Invalid operator: "+operator);
        }




    }
}
