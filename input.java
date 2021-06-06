import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your first name");
        String lastName = input.next();

        System.out.println("My name is " + firstName + " " + lastName);

    }
}
