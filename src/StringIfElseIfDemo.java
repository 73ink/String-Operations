public class StringIfElseIfDemo {
    public static void main(String[] args) {
        String sampleText = "Aaisha";

        System.out.println("Original string: " + sampleText);

        if (sampleText.isEmpty()) {
            System.out.println("The string is empty.");
        } else if (sampleText.length() < 5) {
            System.out.println("The string is short.");
        } else if (sampleText.startsWith("A")) {
            System.out.println("The string starts with 'A'.");
        } else if (sampleText.endsWith("a")) {
            System.out.println("The string ends with 'a'.");
        } else if (sampleText.equalsIgnoreCase("aaisha")) {
            System.out.println("The string matches 'aaisha' ignoring case.");
        } else {
            System.out.println("No condition matched.");
        }
    }
}