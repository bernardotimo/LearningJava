package formatting;

public class FormattingDemo {

    public static void main(String[] args) {

        //System.out.printf used when you just want to show output
        //String.format uses when you want to store the formatted text in a variable

        //Example
        String name = "Bernardo";
        int age = 22;
        int points = 100;

        System.out.printf("Name: %s, Age: %d%n", name, age);

        String message = String.format(
                "modularization.User %s has %d points",
                name, points
        );

        System.out.println(message);
    }
}
