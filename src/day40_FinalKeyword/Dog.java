package day40_FinalKeyword;

public class Dog extends Animal{


    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }
    public void eat(){
        System.out.println(getName()+" is eating dog");
    }
  //final method cannot be override  public void drink(){
     //   System.out.println(getName()+" is drinking water");}

}
