package challenge8;
import java.util.Random;

public class OrderIDGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        String[] orderIDs = new String[5];

        for (int i = 0; i < orderIDs.length; i++) {
            char prefix = (char) (random.nextInt(5) + 'A'); // Random char A–E
            int number = random.nextInt(999) + 1;           // Random number 1–999
            String suffix = String.format("%03d", number);  // Format with leading zeros
            orderIDs[i] = prefix + suffix;
        }

        for (String orderID : orderIDs) {
            System.out.println(orderID);
        }
    }
}
