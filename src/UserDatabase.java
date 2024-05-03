import java.util.HashMap;
import java.util.Map;

public class UserDatabase {
    private static final Map<String, String> users = new HashMap<>();

    // Method to add a new user
    public static void addUser(String email, String password) {
        users.put(email, password);
    }

    // Method to check if the user exists and if the password matches
    public static boolean isValidUser(String email, String password) {
        String storedPassword = users.get(email);
        return storedPassword != null && storedPassword.equals(password);
    }
}