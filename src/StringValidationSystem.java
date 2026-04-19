import java.util.*;

public class StringValidationSystem {
    public static void main (String[] args){
     Scanner inputScanner = new Scanner(System.in);

     System.out.println("Enter a sample string: ");
     String enteredText = inputScanner.nextLine();


        System.out.println("Original string: " + enteredText);
        System.out.println("Length: " + enteredText.length());
        System.out.println("Uppercase: " + enteredText.toUpperCase());
        System.out.println("Lowercase: " + enteredText.toLowerCase());

        System.out.println("Enter a word to search inside the string: ");
        String searchWord = inputScanner.nextLine();

        System.out.println("Search result: " + enteredText.contains(searchWord));

        System.out.println("Enter another string for comparision: ");
        String comparisonText = inputScanner.nextLine();
        System.out.println("Comparison result: " + enteredText.equalsIgnoreCase(comparisonText));

        if (enteredText.length() >= 3) {
            System.out.println("Extracted substring: " + enteredText.substring(0, 3));
        } else {
            System.out.println("Substring cannot be extracted because the string is too short.");
        }

        if (enteredText.length() > 5) {
            System.out.println("The string length is greater than 5.");
        } else {
            System.out.println("The string length is 5 or less.");
        }

        inputScanner.close();
    }
}
