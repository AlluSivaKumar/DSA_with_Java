package OOP6.Cloning;

public class Main 
{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        CloneExample kunal = new CloneExample(34,"Kunal Kushwa");
        //CloneExample siva = new CloneExample(kunal);//but this auctually takes more time because to create a new object and copy from the old one

        //CloneExample twin = (CloneExample) kunal.clone();
    }
}
