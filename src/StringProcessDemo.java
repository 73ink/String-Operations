public class StringProcessDemo {
    public static void main(String[] args) {

        String record = "    Aaisha,Digital Marketing,OOMCO";

        System.out.println("Original Record: [" + record + "]");

        String cleaned = record.trim();
        System.out.println("Cleaned Record: [" + cleaned + "]");
        String[] parts = cleaned.split(",");

        System.out.println("Split Data:");
        for (String part : parts){
            System.out.println(part);
        }
        String dept1 = "DIGITAL MARKETING";
        String dept2 = "digital marketing";

        System.out.println("Same department? " + dept1.equalsIgnoreCase(dept2));

        String emptyValue = "";
        System.out.println("Is empty? " + emptyValue.isEmpty());
    }
}
