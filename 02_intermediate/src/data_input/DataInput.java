package data_input;
import java.util.Scanner;

public class DataInput {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String input (Single word)
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        // String input (full line)
        System.out.println("Enter your full address: ");
        String address = scanner.nextLine();

        // Integer input
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        // Double input
        System.out.println("Enter your height: ");
        double height = Double.parseDouble(scanner.nextLine());

        // Boolean input
        System.out.println("Are you an user? (True / False)");
        boolean user = Boolean.parseBoolean(scanner.nextLine());

        //Character input
        System.out.println("Enter you name initial: ");
        char initialName = scanner.nextLine().charAt(0);

        //Output section
        System.out.println("First name: " + firstName);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("user? " + user);
        System.out.println("Initial: " + initialName);

        scanner.close();
    }
}
