import java.util.Scanner;

public class CompleteStringProcessingSystem {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String originalText = inputScanner.nextLine();

        System.out.println("Original string: " + originalText);
        System.out.println("Total number of characters: " + originalText.length());
        System.out.println("Uppercase form: " + originalText.toUpperCase());
        System.out.println("Lowercase form: " + originalText.toLowerCase());

        System.out.print("Enter a word to search in the string: ");
        String searchWord = inputScanner.nextLine();
        System.out.println("Does the string contain this word? " + originalText.contains(searchWord));

        System.out.print("Enter another string for comparison: ");
        String comparisonText = inputScanner.nextLine();
        System.out.println("Comparison result using equalsIgnoreCase: " + originalText.equalsIgnoreCase(comparisonText));

        if (!originalText.isEmpty()) {
            System.out.println("First character of the string: " + originalText.charAt(0));
        } else {
            System.out.println("The string is empty, so no first character can be displayed.");
        }

        int vowelCount = 0;

        for (int index = 0; index < originalText.length(); index++) {
            char currentCharacter = Character.toLowerCase(originalText.charAt(index));

            if (currentCharacter == 'a' || currentCharacter == 'e' || currentCharacter == 'i'
                    || currentCharacter == 'o' || currentCharacter == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Total number of vowels: " + vowelCount);

        if (originalText.length() > 10) {
            System.out.println("The string is long.");
        } else {
            System.out.println("The string is short.");
        }

        inputScanner.close();
    }
}