public class StringIfElseDemo {
    public static void main(String[] args) {
        String username = "Aaisha73";
        String password = "OOMCO2026";

        System.out.println("Entered username: " + username);

        if (username.length() > 5) {
            System.out.println("Username length is valid.");
        } else {
            System.out.println("Username is too short.");
        }

        if (password.equals("OOMCO2026")) {
            System.out.println("Password is correct.");
        } else {
            System.out.println("Password is incorrect.");
        }

        if (username.contains("A")) {
            System.out.println("Username contains the letter 'A'.");
        } else {
            System.out.println("Username does not contain the letter 'A'.");
        }

        if (username.isEmpty()) {
            System.out.println("Username is empty.");
        } else {
            System.out.println("Username is not empty.");
        }
    }
}