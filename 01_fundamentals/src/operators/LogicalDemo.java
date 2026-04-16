package operators;

public class LogicalDemo {

    public static void main(String[] args) {

        //Used to combine boolean expressions

        //Simple logic
        int a = 10;
        int b = 15;

        System.out.println("Is a greater than 0 and b less than 20? " + (a > 0 && b < 20));
        System.out.println("Is a less than 5 and b greater than 10? " + (a < 5 && b > 10));
        System.out.println("Is a greater than 10 or b less than -1? " + (a > 10 || b < -1));
        System.out.println("Is a less than 8 or b less than 5? " + (a < 8 || b < 5));

        //Access control
        boolean isAuthenticated = true;
        boolean hasPermission = true;

        if (isAuthenticated && hasPermission) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        //NOT operator
        boolean isBlocked = false;

        if(!isBlocked) {
            System.out.println("modularization.User active");
        }
    }
}
