package day10NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n=100;
        if(n%2==0){
            System.out.println("even");//string

        }else{
            System.out.println("odd");//string
        }
        System.out.println("--------------");
      String result1=  (n%2 == 0)? "Even":"Odd";
        System.out.println(result1);

    }
}
