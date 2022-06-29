package day09_IfStatement;

public class MedianNumber {
    public static void main(String[] args) {
        int a=10,
                b=15,
                c=20;
        boolean aIsMedıan= (a>b && a<c) || (a>c && a<b);
        boolean bIsMedian=(b>c && b<a) || (b>a && b<c);
        boolean cIsMedıan=!aIsMedıan && !bIsMedian;

        if(aIsMedıan){
            System.out.println("aIsMedıan = " + a);


        }
        if(bIsMedian){
            System.out.println("bIsMedian = " + b);

        }
        if(cIsMedıan){
            System.out.println("cIsMedıan = " + c);

        }







    }
}
