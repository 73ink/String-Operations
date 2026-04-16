public class StringCompareDemo {
    public static void main (String[] args){
        String username = "73ink";
        System.out.println("Username: " + username);
        System.out.println("Character at index 2: " + username.charAt(2));
        System.out.println("Substring (0-5): " + username.substring(0, 5));

        String enteredUsername = "73ink";
        System.out.println("Is same username? " + username.equals(enteredUsername));

        String differentUsername = "Aaisha73";
        System.out.println("Is same as different username? " + username.equals(differentUsername));


    }
}
