public class StringAnalysisDemo {
    public static void main(String[] args) {
        String firstText = "Aaisha works in Digital Marketing";
        String secondText = "Aaisha works in Digital Marketing";

        System.out.println("First text: " + firstText);
        System.out.println("Length of first text: " + firstText.length());

        boolean areEqual = firstText.equals(secondText);
        System.out.println("Are both texts equal? " + areEqual);

        int positionOfWord = firstText.indexOf("Digital");
        System.out.println("Position of word 'Digital': " + positionOfWord);

        boolean startsCorrectly = firstText.startsWith("Aaisha");
        System.out.println("Does the text start with 'Aaisha'? " + startsCorrectly);

        boolean endsCorrectly = firstText.endsWith("Marketing");
        System.out.println("Does the text end with 'Marketing'? " + endsCorrectly);
    }
}