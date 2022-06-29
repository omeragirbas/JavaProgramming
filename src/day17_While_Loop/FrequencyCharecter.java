package day17_While_Loop;

public class FrequencyCharecter {
    public static void main(String[] args) {
        String str="AAABBCCDD";

    char ch='A';
    int frequency=0;
    for(int i=0; i<str.length();i++){
        char eachch=str.charAt(i);
        if(ch== eachch){
            frequency++;

        }
        System.out.println(frequency);
    }
    }
}
