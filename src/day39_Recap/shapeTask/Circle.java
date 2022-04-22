package day39_Recap.shapeTask;

public class Circle extends Shape {
    private double radius;
    public static double pi=3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.err.println("invalid radius: "+radius);
            System.exit(1);
        }
        this.radius = radius;
    }

   // public Circle(String name, double radius) {
       // super(name);
   public Circle( double radius) {
        super("Circle");
        //this.radius = radius;
        setRadius(radius);
    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi='" + pi + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
