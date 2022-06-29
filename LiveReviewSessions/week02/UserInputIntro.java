package week02;

import java.util.Scanner;

public class UserInputIntro {
    public static void main(String[] args) {

        String name1= "Omer"; // ****HARD CODED WAY****
        String name="";
        //output goes to console ---- print or println
        System.out.println("output");
        //how can i receive input for my Java class
        // 1. create your scanner object

        Scanner input = new Scanner (System.in); // you dont see anything

        //2. promp to user for putting input

        System.out.println("put your name: "); //this is printed out to console

        //3. get the input
        name = input.next();// reads the data from console and assigns the value to my variable

        // 4. use the value that I read

        System.out.println("name = " + name);

        // step 1 and 3 are must step 2 and 4 optional
        //**** WE NEED TO IMPORT SCANNER CLASS FROM JAVA UTULITIES
        // import java.util.Scanner ;
        // istersen input.nextDouble()= double data type input.nextInt() =integer data type



    }
}
