package modularization;

public class Main {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        User name = new User();

        name.fullName = "John Mike";

        int result = cal.sum(5,3);
        System.out.println(result);
        name.fullName();
    }
}
