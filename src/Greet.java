import java.util.Scanner;

public class Greet {

    private String username;

    public Greet(String username) {
        this.username = username;
    }

    public String sayHello() {
        return "Hello, " + username + "!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String nameInput = scanner.nextLine();

        Greet user = new Greet(nameInput);
        System.out.println(user.sayHello());

        scanner.close();
    }
}
