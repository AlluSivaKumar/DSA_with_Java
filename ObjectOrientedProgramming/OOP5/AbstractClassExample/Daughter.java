package OOP5.AbstractClassExample;

public class Daughter extends Parent
{

    @Override
    void career(String name) {
        System.out.println("I am goint to be " + name);
        
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + ".She is " + age);
    }
    
}
