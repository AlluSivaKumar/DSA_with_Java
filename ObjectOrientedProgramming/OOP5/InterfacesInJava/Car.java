package OOP5.InterfacesInJava;

public class Car implements Engine,Brake,Music{

    

    @Override
    public void brake() {
        System.out.println("I break like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");
    }

    @Override
    public void acclerate() {
        System.out.println("I acclerate like a normal car");
    }
    
}
