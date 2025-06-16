package Challenge7;

public class MainApplication {
    public static void main(String[] args) {
        Admin curAdmin = new Admin(1234, "Stephen", "xa1@LW42%3");
        User curUser = new User(4455, "John");

        curAdmin.performOperation(new Update()); // Output: Data has been updated
        curUser.performOperation(new View());    // Output: Some data has been displayed
    }
}
