package OOP1;

public class Person {
    String name;
    int age;

    // Default constructor calling the parameterized one
    public Person() {
        this("Unknown", 18); // Calls the constructor below
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.age);
    }
}

