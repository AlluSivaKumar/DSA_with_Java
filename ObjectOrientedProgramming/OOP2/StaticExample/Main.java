package OOP2.StaticExample;

public class Main
{
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Human kunal = new Human(22, "KUNAL", 50000, false);
        System.out.println(kunal.population);
        Human rahul = new Human(34, "RAHUL", 60000, false);

        System.out.println(kunal.population); // HERE KUNAL REFER TO HUMAN DIRECTLY
        System.out.println(rahul.population );

        Main main = new Main();
        main.greeting();
    }

    void greeting()
    {
        System.out.println("Hello");
        hii();
    }

    void hii()
    {
        System.out.println("hiiii");
    }
}
