package OOP3Inheritance;

public class BoxPrice extends BoxWidth
{
    double cost;

    BoxPrice () {
        super();
        this.cost = -1;
    }

    BoxPrice (double cost) {
        super(cost);
        this.cost = cost;
    }

    BoxPrice (double l, double b, double h, double weight, double cost) {
        super(l,b,h,weight);
        this.cost = cost;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }
}
