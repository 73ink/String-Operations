public class StringCheckDemo {
    public static void main(String[] args) {
        String message = "Welcome Aaisha to Oman Oil Marketing Company";

        System.out.println("Original Message: " + message);

        String extracted = message.substring(8, 14);
        System.out.println("Extracted Text: " + extracted);

        String replaced = message.replace("Welcome", "Hello");
        System.out.println("Updated Message: " + replaced);

        System.out.println("Contains 'Oman'? " + message.contains("Oman"));

        char firstChar = message.charAt(0);
        System.out.println("First Character: " + firstChar);

        String secondText = "Experience Hub Program";
        System.out.println("Uppercase: " + secondText.toUpperCase());
    }
}