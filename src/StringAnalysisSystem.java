import java.util.Scanner;

public class StringAnalysisSystem {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String originalText = inputScanner.nextLine();

        System.out.println("Original string: " + originalText);
        System.out.println("Number of characters: " + originalText.length());

        System.out.print("Enter a word to search in the string: ");
        String searchWord = inputScanner.nextLine();
        System.out.println("Does the string contain the word? " + originalText.contains(searchWord));

        System.out.print("Enter another string for comparison: ");
        String comparisonText = inputScanner.nextLine();
        System.out.println("Comparison result: " + originalText.equalsIgnoreCase(comparisonText));

        if (!originalText.isEmpty()) {
            System.out.println("First character of the original string: " + originalText.charAt(0));
        } else {
            System.out.println("The string is empty, so no character can be displayed.");
        }

        if (originalText.length() > 10) {
            System.out.println("The string is long.");
        } else {
            System.out.println("The string is short.");
        }

        inputScanner.close();
    }
}