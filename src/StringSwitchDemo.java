public class StringSwitchDemo {
    public static void main(String[] args) {
        String departmentName = "Marketing";

        System.out.println("Original department: " + departmentName);

        switch (departmentName) {
            case "Marketing":
                System.out.println("You are working in the Marketing department.");
                break;

            case "Digital":
                System.out.println("You are working in the Digital department.");
                break;

            case "Finance":
                System.out.println("You are working in the Finance department.");
                break;

            default:
                System.out.println("Unknown department.");
                break;
        }

        String secondDepartment = "Digital";
        System.out.println("\nSecond test value: " + secondDepartment);

        switch (secondDepartment) {
            case "Marketing":
                System.out.println("You are working in the Marketing department.");
                break;

            case "Digital":
                System.out.println("You are working in the Digital department.");
                break;

            case "Finance":
                System.out.println("You are working in the Finance department.");
                break;

            default:
                System.out.println("Unknown department.");
                break;
        }

        String thirdDepartment = "HR";
        System.out.println("\nThird test value: " + thirdDepartment);

        switch (thirdDepartment) {
            case "Marketing":
                System.out.println("You are working in the Marketing department.");
                break;

            case "Digital":
                System.out.println("You are working in the Digital department.");
                break;

            case "Finance":
                System.out.println("You are working in the Finance department.");
                break;

            default:
                System.out.println("Unknown department.");
                break;
        }
    }
}