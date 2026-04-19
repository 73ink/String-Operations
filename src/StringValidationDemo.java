public class StringValidationDemo {
    public static void main(String[] args) {
        String textValue = "aaisha_report.pdf";

        System.out.println("Original string: " + textValue);

        boolean startsWithText = textValue.startsWith("aaisha");
        System.out.println("Starts with 'aaisha'? " + startsWithText);

        boolean endsWithText = textValue.endsWith(".pdf");
        System.out.println("Ends with '.pdf'? " + endsWithText);

        String updatedValue = textValue.replace("report", "portfolio");
        System.out.println("Updated string: " + updatedValue);

        String extractedPart = textValue.substring(0, 6);
        System.out.println("Extracted part: " + extractedPart);

        System.out.println("Length of string: " + textValue.length());
    }
}