public class StringLoopDemo {
    public static void main(String[] args) {
        String sampleSentence = "Aaisha2026";

        System.out.println("Original string: " + sampleSentence);
        System.out.println("Total characters: " + sampleSentence.length());

        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;

        for (int index = 0; index < sampleSentence.length(); index++) {
            char currentCharacter = sampleSentence.charAt(index);
            System.out.println(currentCharacter);

            if (Character.isDigit(currentCharacter)) {
                digitCount++;
            } else if (Character.isLetter(currentCharacter)) {
                char lowerCharacter = Character.toLowerCase(currentCharacter);

                if (lowerCharacter == 'a' || lowerCharacter == 'e' || lowerCharacter == 'i'
                        || lowerCharacter == 'o' || lowerCharacter == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Total vowels: " + vowelCount);
        System.out.println("Total consonants: " + consonantCount);
        System.out.println("Total digits: " + digitCount);
    }
}