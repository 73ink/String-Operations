public class StringOperationsDemo {
    public static void main(String[] args){
        String customerName = "Aaisha AL-Rubaie";
        String companyName = " - Oman Oil Marketing Company (OOMCO)";

        System.out.println("Original Name: " + customerName);
        System.out.println("Length: " + customerName.length());
        System.out.println("UpperCase: " + customerName.toUpperCase());
        System.out.println("LowerCase: " + customerName.toLowerCase());

       String combined = customerName.concat(companyName);
        System.out.println("Combined String: " + combined);

    }
}
