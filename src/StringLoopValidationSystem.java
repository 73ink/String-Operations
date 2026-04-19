import java.util.Scanner;

public class StringLoopValidationSystem {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String originalText = inputScanner.nextLine();

        System.out.println("Original string: " + originalText);
        System.out.println("Total number of characters: " + originalText.length());

        int vowelCount = 0;

        for (int index = 0; index < originalText.length(); index++) {
            char currentCharacter = originalText.charAt(index);
            System.out.println(currentCharacter);

            char lowerCharacter = Character.toLowerCase(currentCharacter);
            if (lowerCharacter == 'a' || lowerCharacter == 'e' || lowerCharacter == 'i'
                    || lowerCharacter == 'o' || lowerCharacter == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Total number of vowels: " + vowelCount);

        System.out.print("Enter a word to search in the string: ");
        String searchWord = inputScanner.nextLine();
        System.out.println("Does the string contain this word? " + originalText.contains(searchWord));

        if (originalText.length() > 10) {
            System.out.println("The string is long.");
        } else {
            System.out.println("The string is short.");
        }

        inputScanner.close();
    }
}