package day17_While_Loop;

public class frequenceWord {
    public static void main(String[] args) {
        String x="JavaJavaJava";
        String r="Java";
        int frequence=0;
        for(int i=0 ; i<x.length()-3 ; i++){//<= olursa 4
            String y=x.substring(i,i+4);
                if(y.equals("Java")){
                    frequence++;
                }


        }System.out.println(frequence);
    }
}
