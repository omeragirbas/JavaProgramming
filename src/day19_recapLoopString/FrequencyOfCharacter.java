package day19_recapLoopString;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str="aabcccd";
        String result="";

        for(int j=0; j<str.length(); j++){
            char ch=str.charAt(j);//a
            int count =0;
            for(int i=0; i<str.length(); i++){
                char each =str.charAt(i); //each charecter
                if(ch==each){
                    count++;
                }

            }
            if(result.contains(""+ch)){
                continue;
            }

            result +=ch;
            result +=count;
        }



        System.out.println(result);


    }
}
