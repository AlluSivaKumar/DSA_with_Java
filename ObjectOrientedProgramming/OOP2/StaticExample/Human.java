package OOP2.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static int population;

    public Human(int age, String name, int salary, boolean married) 
    {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1; // Make  population static bcz it always same to every person
    }
}
