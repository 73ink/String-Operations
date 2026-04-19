import java.util.Scanner;

public class StringMenuDemo {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String enteredText = inputScanner.nextLine();

        System.out.println("\nString Menu");
        System.out.println("1. Display length");
        System.out.println("2. Convert to uppercase");
        System.out.println("3. Convert to lowercase");
        System.out.println("4. Check if the string contains a word");
        System.out.println("5. Compare with another string using equalsIgnoreCase");

        System.out.print("Enter your choice: ");
        int userChoice = inputScanner.nextInt();
        inputScanner.nextLine();

        switch (userChoice) {
            case 1:
                System.out.println("Length of the string: " + enteredText.length());
                break;

            case 2:
                System.out.println("Uppercase string: " + enteredText.toUpperCase());
                break;

            case 3:
                System.out.println("Lowercase string: " + enteredText.toLowerCase());
                break;

            case 4:
                System.out.print("Enter a word to search: ");
                String searchWord = inputScanner.nextLine();
                System.out.println("Does the string contain \"" + searchWord + "\"? " + enteredText.contains(searchWord));
                break;

            case 5:
                System.out.print("Enter another string for comparison: ");
                String comparisonText = inputScanner.nextLine();
                System.out.println("Are both strings equal ignoring case? " + enteredText.equalsIgnoreCase(comparisonText));
                break;

            default:
                System.out.println("Invalid menu choice.");
        }

        inputScanner.close();
    }
}