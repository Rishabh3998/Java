package JavaOOPSInOneVideo;

public class JavaOOPS {
    // In .java ext file only one [public] class can exist where filename and public class name will be same.
    public static void oops () {
        // In real world and programming everything is an Object.

        // Classes and Objects
        // Class is a blueprint of an object.
        // Object is an instance of a class.

        // Using default constructor to create an object/instance
        Person person = new Person();
        person.name = "Rishabh";

        // Using default constructor to create an object/instance
        Person person2 = new Person();
        person2.name = "Vansh";

        person.displayName();
        person2.displayName();
        person.eat();

        // Following polymorphism (Compile time)
        person2.walk();
        person2.walk(10000);

        System.out.println(Person.count);

        Person person3 = new Person("Ritik", 24);
        person3.displayName();
    }
}

class Person {
    // Properties
    String name;
    int age;
    // static means property of a class not an object
    // to access this property we don't need to create any object.
    static int count; // total number of persons

    // Default constructor (Optional to declare)
    public Person () {
        count++;
        System.out.println("Default constructor called");
    }

    // User-defined Constructor.
    // Constructor overloading
    public Person (String name, int age) {
        this(); // To access default constructor logic, this helps to reduce code duplicate.
        this.name = name;
        this.age = age;
    }

    // Methods
    void displayName () {
        System.out.println(this.name);
    }

    void walk () {
        System.out.println(this.name + " is walking.");
    }

    void eat () {
        System.out.println(this.name + " is eating.");
    }

    // Function overloading
    void walk (int steps) {
        System.out.println(this.name + " walked " + steps + " steps.");
    }

    // Polymorphism => poly + morphism
    // Taking multiple forms
    // There are 2 types compile and run-time polymorphism
    // As we saw above that our walk func can run differently acc to the args passes into it.
    // This is polymorphism
}
