import java.util.Scanner;

public class Greet {

    private String username;  // Field to store user's name

    // Constructor that takes a username
    public Greet(String username) {
        this.username = username;
    }

    // Method to greet the user
    public String sayHello() {
        return "Hello, " + username + "!";
    }

    // Main method to test the class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner to read input

        System.out.print("Enter your name: ");
        String nameInput = scanner.nextLine();  // Read user input

        Greet user = new Greet(nameInput);  // Create Greet object with user's input
        System.out.println(user.sayHello());  // Greet the user

        scanner.close();  // Close the scanner
    }
}
