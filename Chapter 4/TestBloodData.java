
import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        // Create a new Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Create a new BloodData object
        BloodData bloodData = new BloodData();

        // Get blood type from user
        System.out.print("Enter Blood Type: ");
        String bloodType = scanner.nextLine();
        bloodData.setBloodType(bloodType);

        // Get Rh factor from user
        System.out.print("Enter Rh Factor: ");
        String rhFactor = scanner.nextLine();
        bloodData.setRhFactor(rhFactor);

        // Display the blood type and Rh factor
        bloodData.displayBloodInfo();

        // Close the scanner
        scanner.close();
    }
}
