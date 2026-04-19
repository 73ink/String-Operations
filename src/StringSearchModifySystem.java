import java.util.Scanner;

public class StringSearchModifySystem {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String originalText = inputScanner.nextLine();

        System.out.println("Original string: " + originalText);

        System.out.print("Enter a word to search in the string: ");
        String searchWord = inputScanner.nextLine();
        System.out.println("Search result: " + originalText.contains(searchWord));

        System.out.print("Enter a word to replace: ");
        String oldWord = inputScanner.nextLine();

        System.out.print("Enter the new replacement word: ");
        String newWord = inputScanner.nextLine();

        String modifiedText = originalText.replace(oldWord, newWord);
        System.out.println("Modified string: " + modifiedText);

        if (modifiedText.length() >= 4) {
            System.out.println("Extracted text: " + modifiedText.substring(0, 4));
        } else {
            System.out.println("Substring cannot be extracted because the modified string is too short.");
        }

        if (!modifiedText.isEmpty()) {
            System.out.println("Character at index 0: " + modifiedText.charAt(0));
        } else {
            System.out.println("The modified string is empty.");
        }

        if (modifiedText.length() > 8) {
            System.out.println("The modified string contains more than 8 characters.");
        } else {
            System.out.println("The modified string contains 8 characters or less.");
        }

        inputScanner.close();
    }
}