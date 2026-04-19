public class StringReverseDemo {
    public static void main(String[] args) {
        String sampleText = "Aaisha";

        System.out.println("Original string: " + sampleText);
        System.out.println("Total characters: " + sampleText.length());

        System.out.println("Characters from beginning to end:");
        for (int index = 0; index < sampleText.length(); index++) {
            System.out.println(sampleText.charAt(index));
        }

        String reversedText = "";
        for (int index = sampleText.length() - 1; index >= 0; index--) {
            reversedText += sampleText.charAt(index);
        }

        System.out.println("Reversed string: " + reversedText);

        char targetCharacter = 'a';
        int count = 0;

        for (int index = 0; index < sampleText.length(); index++) {
            if (Character.toLowerCase(sampleText.charAt(index)) == targetCharacter) {
                count++;
            }
        }

        System.out.println("Number of times '" + targetCharacter + "' appears: " + count);
        System.out.println("Original: " + sampleText);
        System.out.println("Reversed: " + reversedText);
    }
}