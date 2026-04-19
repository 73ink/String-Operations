public class StringDataDemo {
    public static void main(String[] args) {
        String sampleSentence = "Aaisha is part of the Experience Hub Program";

        System.out.println("Original string: " + sampleSentence);
        System.out.println("Uppercase: " + sampleSentence.toUpperCase());
        System.out.println("Lowercase: " + sampleSentence.toLowerCase());

        int position = sampleSentence.indexOf("Experience");
        System.out.println("Position of 'Experience': " + position);

        String extractedPart = sampleSentence.substring(18, 32);
        System.out.println("Extracted text: " + extractedPart);

        boolean containsWord = sampleSentence.contains("Hub");
        System.out.println("Does the string contain 'Hub'? " + containsWord);
    }
}