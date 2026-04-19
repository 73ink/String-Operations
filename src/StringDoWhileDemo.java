public class StringDoWhileDemo {
    public static void main(String[] args) {
        String sampleSentence = "digital marketing at oomco";

        System.out.println("Original string: " + sampleSentence);
        System.out.println("Total characters: " + sampleSentence.length());

        int index = 0;
        int lowercaseCount = 0;
        int spaceCount = 0;

        do {
            char currentCharacter = sampleSentence.charAt(index);
            System.out.println(currentCharacter);

            if (Character.isLowerCase(currentCharacter)) {
                lowercaseCount++;
            }

            if (currentCharacter == ' ') {
                spaceCount++;
            }

            index++;
        } while (index < sampleSentence.length());

        System.out.println("Total lowercase letters: " + lowercaseCount);
        System.out.println("Total spaces: " + spaceCount);
    }
}