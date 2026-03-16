package methods;

public class CustomMethods {

    public static void main (String[] args) {

        // Calling a void method
        greetUser("Alice");

        // Calling a method that returns a value
        int sum = addNumbers(5, 7);

        // Calling a boolean method
        boolean result = isEven(10);

        // Calling overloaded methods
        System.out.println("Square of 4: " + square(4));
        System.out.println("Square of 3.5: " + square(3.5));

        //Calling methods with multiple operations
        printMultiplicationTable(5);
    }

    public static void greetUser(String name) {

        System.out.println("Hello, " + name);
    }

    public static int addNumbers(int a, int b) {

        return a + b;
    }

    public static boolean isEven(int number) {

        return number % 2 == 0;
    }

    // Method overloading - same name, different parameters
    public static int square(int number) {

        return number * number;
    }

    public static double square(double number) {

        return number * number;
    }

    public static void printMultiplicationTable(int number) {

        System.out.println("\n=== MULTIPLICATION TABLE OF " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println();
    }
}
