public class StringPositionDemo {
    public static void main(String[] args) {
        String email = "gtzx7193@gmail.com";

        System.out.println("Email: " + email);

        int atPosition = email.indexOf("@");
        System.out.println("Position of '@': " + atPosition);

        System.out.println("Starts with 'gt'? " + email.startsWith("gt"));
        System.out.println("Ends with '.com'? " + email.endsWith(".com"));
    }
}