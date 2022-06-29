package day13_String;

import java.util.Scanner;
import java.lang.String;
public class MyInfo {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Java program";
        String str3="program";
        char c=' ';
        String s1=str1+str3;
        String s2=str1+"c";
        String s3=str1+c;
        String s4=" ";
        System.out.println("s4: ilki bu "+s4);
        s4+=str1;
        String s5=s4+str3;
        System.out.println("s1: "+s1);
        System.out.println("s2: "+s2);
        System.out.println("s3: "+s3);
        System.out.println("s4: "+s4);
        System.out.println("s5: "+s5);

    }
}
