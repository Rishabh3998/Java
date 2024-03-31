package JavaOOPSInOneVideo.EncapsulationIntro;

public class Encapsulation {
    // public void doWork () {
    //     System.out.println("Encapsulation class is working");
    // }

    // If we remove public then this method will only be accessible in this package and its child package and classes.
    // This is a by default behaviour
    // void doWork () {
    //     System.out.println("Default behavior with no public");
    // }

    // To make this function only accessible in this class only not even on this package but only available
    // on this class itself only. We can use private keyword.

    private void doWork () {
        // Only accessible in Encapsulation class
        System.out.println("Private keyword used");
    }

    public static void main () {
        Laptop l1 = new Laptop();
        l1.setPrice(23);
    }
}

class Laptop {
    private int price;

    public void setPrice (int price) {
        // if the user is admin
        this.price = price;
    }
}
