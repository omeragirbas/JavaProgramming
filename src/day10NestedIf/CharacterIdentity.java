package day10NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch = 65;
        if (ch >= '0' && ch <= 9) {// bu koseli paranteze gerek yok

            System.out.println("digit");
        } else if ((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z') ){
            System.out.println("Alphabetic");
        }else{

            System.out.println("Special character");
        }
    }


}
