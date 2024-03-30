package JavaInOneVideo;

import java.util.Scanner;

public class IntroToJava1Hr {
    // All these functions are also called as Methods
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

        // 4. Conditional Operator
        // >, <, >=, <=, !=, ==

        // 5. Bitwise Operator
        // &, |, ~, ^

        // Taking user input
        Scanner sc = new Scanner(System.in);
        int inputValue = sc.nextInt(); // Take integer type input
        double doubleValue = sc.nextDouble(); // Take double type input
        String stringValue = sc.next(); // we can use sc.nextLine() as well to take white space as input as well in string
    }

    public static void conditionalStatements () {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // Conditional statement if-else block if-else-if-else block exist too.
        if ( age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not an Adult");
        }

        // Switch case: This used when there are multiple if else conditions to clean up the code
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break; // If we don't add break switch will check each case and print each line without any termination
            case 'B':
                System.out.println("Very good!");
                break;
            case 'C':
                System.out.println("Satisfactory");
                break;
            case 'D':
                System.out.println("Need Improvement");
                break;
            case 'F':
                System.out.println("Better luck next time!");
                break;
            default:
                System.out.println("Default case");
        }
    }

    public static void loops () {
        // For loop
        String name = "Rishabh";
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(name);
        }

        // While loop
        int cases = 10;
        while (cases != 0) {
            System.out.println(name);
            cases--;
        }

        // Do-while loop
        int testCases = 10;
        do {
            System.out.println(name);
            testCases--;
        } while (testCases != 0);
    }

    public static void arrays () {
        // Arrays
        // A user defined data-type which can store collection of values with same data-type

        int[] array = new int[5];
        int[] array2 = {1,2,3,4,5};
        //        for (int i = 0 ; i < array2.length ; i++) {
        //            System.out.println(array2[i]);
        //        }
        for (int j : array2) {
            System.out.println(j);
        }

        // Matrix or 2-D array
        int[][] matrix = new int[5][5]; // Matrix of 5x5
        int[][] newMatrix = {{1,2}, {1,3}, {1,4}};
        System.out.println(newMatrix[0][1]);
    }

    // Method:
    // returnType function/MethodName (parameters) {
    //  code
    // }
    // functionName(arguments);

    // static keyword: to access any static entity we don't need to create an object for that class where this method exists.
    // Non-static entity can only be accesses via objects of that respective class.

    public static void exceptionHandling () {
        int[] array = {1,2,3,4};
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println(err.getLocalizedMessage());
            System.out.println("Provide valid index");
        }
        System.out.println("After exception line");
    }
}
