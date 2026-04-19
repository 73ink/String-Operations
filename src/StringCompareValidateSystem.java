import java.util.Scanner;

public class StringCompareValidateSystem {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String originalText = inputScanner.nextLine();

        System.out.println("Original string: " + originalText);
        System.out.println("Total number of characters: " + originalText.length());

        System.out.print("Enter another string for comparison: ");
        String comparisonText = inputScanner.nextLine();
        System.out.println("Are both strings equal? " + originalText.equals(comparisonText));

        System.out.print("Enter a prefix value: ");
        String prefixValue = inputScanner.nextLine();
        System.out.println("Does the original string start with this prefix? " + originalText.startsWith(prefixValue));

        System.out.print("Enter a suffix value: ");
        String suffixValue = inputScanner.nextLine();
        System.out.println("Does the original string end with this suffix? " + originalText.endsWith(suffixValue));

        if (originalText.length() > 8) {
            System.out.println("The original string is longer than 8 characters.");
        } else {
            System.out.println("The original string is 8 characters or less.");
        }

        inputScanner.close();
    }
}