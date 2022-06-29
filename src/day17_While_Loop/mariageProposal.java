package day17_While_Loop;

import java.util.Scanner;

public class mariageProposal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Will you marry me?yes or no");
    String a= scan.next().toLowerCase();
    while(!(a.equals("yes")|| a.equals("no"))){
        System.out.println("Enter valid answer");
        a=scan.next().toLowerCase();
    }
    if(a.equals("yes")){
        System.out.println("Congrets");
    }else{
        System.out.println("Goodby");
    }
    }
}
