package day17_While_Loop;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str="Java Java Python Python";
        int frequency = 0;
        while (str.contains("Java")){
            str=str.replaceFirst("Java","");
            frequency ++ ;

        }
        System.out.println(frequency);
        System.out.println("--------------------------");

        String str2="cat cat cat cat dog dog dog cat cat";
        int countCat=0;
        while (str2.contains("cat")){
            str2=str2.replaceFirst("cat","");
            countCat++;


        }
        System.out.println(countCat);
    }

}
