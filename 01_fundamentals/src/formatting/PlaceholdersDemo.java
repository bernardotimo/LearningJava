package formatting;

public class PlaceholdersDemo {

    public static void main(String[] args){

        /*
        %s    String
        %d    Integer
        %f    Decimal number
        %.2f  Decimal with 2 places
        %b    Boolean
        %c    Character
        %n    New line
        %10s  Right-aligned width 10
        %-10s Left-aligned width 10
        %05d  Integer padded with zeros
        */

        String name = "Bernardo";
        int age = 22;
        double height = 1.7856;
        boolean student = true;
        char initial = 'B';
        int score = 95;

        //Basic placeholders
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Height: %f%n", height);
        System.out.printf("Student: %b%n", student);
        System.out.printf("Initial: %c%n", initial);

        System.out.println();

        //Decimal formatting

        System.out.printf("2 decimals: %.2f%n", height);
        System.out.printf("3 decimals: %.3f%n", height);

        System.out.println();

        //Width and alignment
        System.out.printf("%-10s %5s%n", "Name", "Score");
        System.out.printf("%-10s %5d%n", name, score);
        System.out.printf("%-10s %5d%n", "Ana", 92);
        System.out.printf("%-10s %5d%n", "John", 80);

        System.out.println();

        //Zero padding
        System.out.printf("Score with padding: %05d%n", score);

        System.out.println();

        //Multiple values in one line
        System.out.printf("modularization.User %s (%c) is %d years old, %.2fm tall, student: %b", name, initial, age, height, student);
    }
}
