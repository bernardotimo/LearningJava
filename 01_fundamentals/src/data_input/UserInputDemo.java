package data_input;
import java.util.Scanner;

public class UserInputDemo {

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

        System.out.printf("Your name is %s, your initial is %c, you're %d old and %.2fm tall. You live in %s. " +
                "Are you an user? %b", firstName, initialName, age, height, address, user);

        scanner.close();

    }
}
