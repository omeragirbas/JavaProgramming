package day39_Recap.shapeTask;

public class Square extends Shape {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <=0){
            System.err.println("invlaid side: "+side );
            System.exit(1);
        }


        this.side = side;
    }

    public Square( double side) {
        super("Square");
   //OTO GELDİ SİLDİ     this.side = side;
    setSide(side);
    }
}
