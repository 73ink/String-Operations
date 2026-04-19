public class StringRecordDemo {
    public static void main(String[] args) {
        String textRecord = "   Aaisha,OOMCO,Digital Marketing   ";

        System.out.println("Original record: [" + textRecord + "]");

        String cleanedRecord = textRecord.trim();
        System.out.println("Cleaned record: [" + cleanedRecord + "]");

        String firstValue = "OOMCO";
        String secondValue = "oomco";
        boolean comparisonResult = firstValue.equalsIgnoreCase(secondValue);
        System.out.println("Are both values equal ignoring case? " + comparisonResult);

        String[] recordParts = cleanedRecord.split(",");
        System.out.println("Split parts:");
        for (String part : recordParts) {
            System.out.println(part);
        }

        String emptyText = "";
        System.out.println("Is emptyText empty? " + emptyText.isEmpty());

        char selectedCharacter = cleanedRecord.charAt(0);
        System.out.println("Character at index 0: " + selectedCharacter);
    }
}