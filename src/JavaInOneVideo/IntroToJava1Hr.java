package JavaInOneVideo;

import java.util.Scanner;

public class IntroToJava1Hr {
    public static void variables () {
        // Introduction to variables in Java
        // A container that can store some value according to the declared data-type

        // Data types:
        // byte, short(2 byte), int(4 bytes), long(8 bytes)
        // float(4 byte), double(8 byte)
        // char(2 byte), string
        // boolean(undefined)

        // Syntax: data-type variable-name = value
        byte byteValue = 10;
        short shortValue = 12;
        int age = 18;
        long longValue = 37821738712L;
        float floatValue = 1.1f;
        double doubleValue = 1.1;
        boolean isAdult = true;
        char charValue = 'a';
        String stringValue = "Rishabh";

        System.out.println(byteValue + ", " + age);
    }

    public static void operators () {
        // 1. Arithmetic Operator
        // +, -, /, *, %, ++, --

        int first = 123;
        int second = 456;

        int add = first + second;
        System.out.println(add);

        int sub = first - second;
        System.out.println(sub);

        int mul = first * second;
        System.out.println(mul);

        double div = (double)second / (double) first;
        System.out.println(div);

        int mod = second % first;
        System.out.println(mod);

        first++;
        second--;

        // 2. Logical Operator
        // &&, ||, !

        // 3. Assignment Operator
        // =

        // 4. Comparison Operator
        // >, <, >=, <=, !=

        // 5. Bitwise Operator
        // &, |, ~, ^

        // Taking user input
        Scanner sc = new Scanner(System.in);
        int inputValue = sc.nextInt(); // Take integer type input
        double doubleValue = sc.nextDouble(); // Take double type input
        String stringValue = sc.next(); // we can use sc.nextLine() as well to take white space as input as well in string
    }
}
