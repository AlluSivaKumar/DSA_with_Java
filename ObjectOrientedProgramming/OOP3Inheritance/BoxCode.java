package OOP3Inheritance;

class Box
{
    double l;
    double w;
    double h;

    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    //Cube
    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void info() {
        System.out.println("The box is Runned.");
    }

}


public class BoxCode
{
    public static void main(String[] args) 
    {
        /* Box box = new Box();
        System.out.println(box.l + " " + box.w + " " + box.h); */

        /* box = new Box(7);
        System.out.println(box.l + " " + box.w + " " + box.h); */

        /* box = new Box(5,7,8);
        System.out.println(box.l + " " + box.w + " " + box.h); */

        /* Box box2 = new Box(box);
        System.out.println(box2.l + " " + box2.w + " " + box2.h); */

        /* BoxWidth box3 = new BoxWidth();
        System.out.println(box3.l + " " + box3.w + " " + box3.h + " " + box3.width);

        BoxWidth box4 = new BoxWidth(9);
        System.out.println(box4.l + " " + box4.w + " " + box4.h + " " + box4.width);

        BoxWidth box5 = new BoxWidth(8, 6, 2, 4);
        System.out.println(box5.l + " " + box5.w + " " + box5.h + " " + box5.width); */

        BoxPrice box6 = new BoxPrice(5);
        System.out.println(box6.h);
    }
}
