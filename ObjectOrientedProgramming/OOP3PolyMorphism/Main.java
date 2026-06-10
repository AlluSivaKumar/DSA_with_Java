package OOP3PolyMorphism;

public class Main 
{
    public static void main(String[] args) 
    {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();

        Shapes cir = new Circle();
        cir.area();//circle area() is called.
    }
}
