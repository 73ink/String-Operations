public class StringModifyDemo {
    public static void main(String[] args) {
        String comment = "   The service   at Oman Oil station was good   ";

        System.out.println("Original: [" + comment + "]");

        String trimmed = comment.trim();
        System.out.println("Trimmed: [" + trimmed + "]");

        boolean containsWord = trimmed.contains("good");
        System.out.println("Contains 'good'? " + containsWord);

        String updated = trimmed.replace("good", "excellent");
        System.out.println("Updated Comment: " + updated);
    }
}