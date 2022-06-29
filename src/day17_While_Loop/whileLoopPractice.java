package day17_While_Loop;

import java.util.Scanner;

public class whileLoopPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your username");
        String u=scan.next();
        System.out.println("Enter your password");
        String p=scan.next();
        if(u.equals("Cydeo")&& p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            int attemps=3;
            while(!(u.equals("Cydeo")&& p.equals("Cydeo123")) && attemps>0){
              if(attemps==1){
                  System.out.println("THIS IS LAST ATTEMPT");
              }
                System.out.println("Incorrect Username or Password, please re-eneter");
                System.out.println("Enter your username");
                u=scan.next();
                System.out.println("Enter your password");
                p=scan.next();
                attemps--;
            }
            if(u.equals("Cydeo")&& p.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("your account block");
            }
        }
        scan.close();
    }
}
