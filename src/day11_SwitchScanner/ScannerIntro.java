package day11_SwitchScanner;

import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {
     int first ,  secon=1;
     first=(secon>1)? 2:1;
     switch (first){
         case 0:
             System.out.println(0);
             break;
         case 1:
             System.out.println(1);
         case 2:
             System.out.println(2);
             break;
         case 3:
             System.out.println(3);
             break;
     }
        System.out.println(1);

    }
}
