package JavaOOPSInOneVideo;

public class Abstraction {

}

class Audi extends Car{

    @Override
    void start() {
        System.out.println("Audi is starting");
    }
}

class BMW extends Car{

    @Override
    void start() {
        System.out.println("BMW is starting");
    }
}

abstract class Car {
    // Car is a concept therefore we don't want to create any object of Car.
    // Either we will prefer to make an object of BMW or Audi
    // Now to revoke the creation of Car object we can use abstract keyword.
    int price;
    // Since this method is abstract in nature therefore it will be defined by the child classes.
    // These child classes will override this abstract method
    // Minimum requirement: Class should also be abstract
    abstract void start ();

    void breaks () {
        System.out.println("Breaks engage");
    }
}
