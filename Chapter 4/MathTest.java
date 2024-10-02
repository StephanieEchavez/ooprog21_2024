public class MathTest {
    public static void main(String[] args) {
        // Example values for testing
        double number = 37.0;
        double radians = 3.14;
        double decimal = 22.7;
        double randomMultiplier = 100;

        // Using Math methods
        double sqrtValue = Math.sqrt(number);
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double floorValue = Math.floor(decimal);
        double ceilValue = Math.ceil(decimal);
        double roundValue = Math.round(decimal);
        double maxValue = Math.max(68, 71);
        double minValue = Math.min(68, 71);
        double randomValue = Math.random() * randomMultiplier;

        // Output
        System.out.println("SQRT: " + sqrtValue);
        System.out.println("SIN: " + sinValue);
        System.out.println("COS: " + cosValue);
        System.out.println("FLOOR: " + floorValue);
        System.out.println("CEIL: " + ceilValue);
        System.out.println("ROUND: " + roundValue);
        System.out.println("MAX: " + maxValue);
        System.out.println("MIN: " + minValue);
        System.out.println("RANDOM: " + randomValue);
    }
}
