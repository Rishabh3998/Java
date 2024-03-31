package JavaOOPSInOneVideo;

import JavaOOPSInOneVideo.EncapsulationIntro.Encapsulation;

public class JavaOOPS {
    // In .java ext file only one [public] class can exist where filename and public class name will be same.
    public static void oops () {
        // In real world and programming everything is an Object.

        // Classes and Objects
        // Class is a blueprint of an object.
        // Object is an instance of a class.

        // Using default constructor to create an object/instance
        // Person person = new Person();
        // person.name = "Rishabh";

        // Using default constructor to create an object/instance
        // Person person2 = new Person();
        // person2.name = "Vansh";

        // person.displayName();
        // person2.displayName();
        // person.eat();

        // Following polymorphism (Compile time)
        // person2.walk();
        // person2.walk(10000);

        // System.out.println(Person.count);

        Person person3 = new Person("Ritik", 24);
        person3.displayName();

        Developer dev = new Developer("Varun", 28);
        dev.displayName();

        // Note: The super parent of every object is Object class itself which provides some helper functions.
        dev.walk(); // Calling from child class if not found then will try to find it in parents class.

        // Encapsulation:
        // We use encapsulation for data-hiding or data protection for security reasons.
        // To achieve these we use packages and access modifiers

        Encapsulation en = new Encapsulation();
        // Accessing this doWork method from Encapsulation class which is defined in different package.
        // This is possible because this method is public and can be accessed anywhere in the program.

        // en.doWork();

        // If we remove that public keyword then doWork method will only be accessible in Encapsulation class
        // and its child packages and classes only which will be considered as hiding. Here packages are helping
        // us to achieve encapsulation.
    }
}

class Developer extends Person {
    // Child class
    // Developer class is child class which is extending from its parent class Person.
    // To extend parent class props we use extends keyword
    public Developer(String name, int age) {
        // Since we don't have any default constructor in Person class,
        // and we are using a user defined constructor we have to create a user defined constructor int Developer
        // class as well which will use super keyword.
        super(name, age); // This keyword is used to call its parent's constructor.
        // When we create a developer a Person will be automatically created via this super keyword.
    }

    // Run-time polymorphism
    // Our dev object doesn't know which walk function to call. If this walk function is found in the same class it will be
    // called else it will be called from Parents class. This will be decided at run-time.
    void walk () {
        System.out.println("Developer " + name + " is walking.");
    }
}

class Person {
    // Parent class of Developer class
    // Properties
    protected String name; // data hiding using protected
    int age;
    // static means property of a class not an object
    // to access this property we don't need to create any object.
    static int count; // total number of persons

    // Default constructor (Optional to declare)
    //    public Person () {
    //        count++;
    //        System.out.println("Default constructor called");
    //    }

    // User-defined Constructor.
    // Constructor overloading
    public Person (String name, int age) {
        // this(); // To access default constructor logic, this helps to reduce code duplicate.
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

    // Inheritance:
    // When a child class take the access of properties from its parent's class the process is called
    // inheritance.

    void doWork () {
        System.out.println("Person is working.");
    }

    // Protected keyword: If we want to make any property, method of the class present in parent to only accessible to
    // itself or its child then we mark them as protected.

    // Abstraction:
    // Here we hide the data to reduce complexity. We only need to expose those methods which is useful for any user.
    // We will hide the unnecessary things that is not required by the user.

    // we can achieve abstraction using abstraction keyword or by using interface
}
