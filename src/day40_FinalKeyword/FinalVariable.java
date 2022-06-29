package day40_FinalKeyword;

public class FinalVariable {
    final  String Birthday;
    final static String name;
    static {
        name="Batch 25";
    }
    public FinalVariable(String birthday) {
      this.Birthday = birthday;
    }

    public static void main(String[] args) {
        final double pi=3.14; //degistiremez artık
        // hata verir pi=4.14 ;

        final String name;
    name="Java";

    //hata verir  name="WoodeN Spoon"
    System.out.println(name);

        System.out.println("-----------------");
        FinalVariable obj=new FinalVariable("may 01");
       //final variable can not be reassigned obj.birthday="june 01"
        System.out.println(obj.Birthday);
        System.out.println("------");
      //en ustte final olarak yaptıgın ıcın olmaz kaldır fınalı sıkıntı olmaz  FinalVariable.name="python";
        System.out.println(FinalVariable.name);
    }
}
