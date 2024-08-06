package p5;

public class UsernameValidator {

    public static String validateUsername(String username) {
        // Check if the username is null
        if (username == null) {
            return "Invalid username";
        }
        
        // Check the length of the username
        if (username.length() < 5 || username.length() > 20) {
            return "Invalid username";
        }

        // Check if the username starts with a letter and contains only allowed characters
        if (!username.matches("^[a-zA-Z][a-zA-Z0-9_]*$")) {
            return "Invalid username";
        }

        // If all checks are passed, the username is valid
        return "Valid username";
    }

    public static void main(String[] args) {
        String[] testUsernames = {"user_123", "1user_name", "userNameTooLongUsername", "user!", "valid_user"};
        
        for (String username : testUsernames) {
            System.out.println("Username: " + username + " - " + validateUsername(username));
        }
    }
}

