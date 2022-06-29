package day35_Encapsulation.encapsulation;

public class PersonObject {
    public static void main(String[] args) {
        Person p1=new Person();
      //  p1.name="dANİEL"
        p1.setName("Dtaniel");
        p1.setAge(28);

        System.out.println(p1.getName()+" : "+p1.getAge());

    }
}
