public class StringWhileDemo {
    public static void main(String[] args) {
        String sampleSentence = "Aaisha Al Rubaie";

        System.out.println("Original string: " + sampleSentence);
        System.out.println("Total characters: " + sampleSentence.length());

        int index = 0;
        int spaceCount = 0;
        int uppercaseCount = 0;

        while (index < sampleSentence.length()) {
            char currentCharacter = sampleSentence.charAt(index);
            System.out.println(currentCharacter);

            if (currentCharacter == ' ') {
                spaceCount++;
            }

            if (Character.isUpperCase(currentCharacter)) {
                uppercaseCount++;
            }

            index++;
        }

        System.out.println("Total spaces: " + spaceCount);
        System.out.println("Total uppercase letters: " + uppercaseCount);
    }
}