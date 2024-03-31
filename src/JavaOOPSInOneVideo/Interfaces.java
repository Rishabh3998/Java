package JavaOOPSInOneVideo;

public class Interfaces implements ICar, IPerson{
    @Override // Helps to depict that this function is an overwritten function
    public void start() {

    }

    @Override
    public void walk() {

    }
}

interface ICar {
    // The methods defined in interfaces are by-default abstract and public
    void start();

    // Interfaces provide true abstraction
    // we cannot define body of any method here.

    // And if we need to implement these interfaces on any class we use implements keyword

    // Note: Java doesn't allow multiple inheritance
}

interface IPerson {
    void walk ();
}
