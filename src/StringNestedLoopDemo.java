public class StringNestedLoopDemo {
    public static void main(String[] args) {
        String firstText = "Aaisha";
        String secondText = "Aisha";

        System.out.println("First string: " + firstText);
        System.out.println("Second string: " + secondText);

        int matchingCharacters = 0;

        for (int firstIndex = 0; firstIndex < firstText.length(); firstIndex++) {
            for (int secondIndex = 0; secondIndex < secondText.length(); secondIndex++) {
                if (firstText.charAt(firstIndex) == secondText.charAt(secondIndex)) {
                    System.out.println("Matching character found: " + firstText.charAt(firstIndex));
                    matchingCharacters++;
                }
            }
        }

        System.out.println("Total matching characters: " + matchingCharacters);

        System.out.println("Character comparison:");
        for (int firstIndex = 0; firstIndex < firstText.length(); firstIndex++) {
            for (int secondIndex = 0; secondIndex < secondText.length(); secondIndex++) {
                System.out.println(firstText.charAt(firstIndex) + " compared with " + secondText.charAt(secondIndex));
            }
        }
    }
}