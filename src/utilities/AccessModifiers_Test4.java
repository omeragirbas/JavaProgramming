package utilities;

import day40_FinalKeyword.ProtectedAccesModifier;

public class AccessModifiers_Test4 extends ProtectedAccesModifier {
    public static void main(String[] args) {
     //   System.out.println(AccessModifiers_Test4.name1); default is not visible outside the package
         System.out.println(AccessModifiers_Test4.name2); //protected is visible outside the package subclass ONLY
            AccessModifiers_Test4.method2();


    }
}
