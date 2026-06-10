package OOP3Inheritance;

class BoxWidth extends Box
{
    double width;

    public BoxWidth() {
        this.width = -1;
    }

    public BoxWidth(double side) {
        super(side);
    }

    public BoxWidth(double l, double w, double h,double width) {
        super(l, w, h);
        this.width = width;
    }

    public BoxWidth(Box old, double width) {
        super(old);
        this.width = width;
    }

    public BoxWidth(BoxPrice other) {
        //TODO Auto-generated constructor stub
    }
}