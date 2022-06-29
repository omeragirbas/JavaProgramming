package day38_Inheritance.carTask;

public class Bmw extends Car{
    public Bmw( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }
    public void breakDown(){
        System.out.println(brand+ " "+ model+ " is breakdown");
    }
    public void racin(){
        System.out.println(brand+ " "+ model+ " is racing");
    }
    @Override
    public void start(){
        System.out.println("call mechanic to jump start "+brand+" "+model);

    }
}
