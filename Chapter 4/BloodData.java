public class BloodData {
    private String bloodType;
    private String rhFactor;

    // Constructor
    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = "+";
    }

    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    // Getter methods
    public String getBloodType() {
        return bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    // Setter methods
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    // Method to set default patient blood type and Rh factor
    public void defaultPatient() {
        this.bloodType = "A";
        this.rhFactor = "-";
    }

    // New method to display blood info
    public void displayBloodInfo() {
        System.out.println("Your blood type is: " + bloodType);
        System.out.println("Your Rh Factor is: " + rhFactor);
    }
}
