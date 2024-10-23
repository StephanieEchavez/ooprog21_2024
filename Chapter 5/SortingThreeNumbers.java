import java.util.Scanner;

public class SortingThreeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = s.nextInt();

        if (num1 <= num2 && num2 <= num3) {
            System.out.println("Ascending order: " + num1 + " " + num2 + " " + num3);
        } else if (num1 <= num3 && num3 <= num2) {
            System.out.println("Ascending order: " + num1 + " " + num3 + " " + num2);
        } else if (num2 <= num1 && num1 <= num3) {
            System.out.println("Ascending order: " + num2 + " " + num1 + " " + num3);
        } else if (num2 <= num3 && num3 <= num1) {
            System.out.println("Ascending order: " + num2 + " " + num3 + " " + num1);
        } else if (num3 <= num1 && num1 <= num2) {
            System.out.println("Ascending order: " + num3 + " " + num1 + " " + num2);
        } else {
            System.out.println("Ascending order: " + num3 + " " + num2 + " " + num1);
        }

        if (num1 >= num2 && num2 >= num3) {
            System.out.println("Descending order: " + num1 + " " + num2 + " " + num3);
        } else if (num1 >= num3 && num3 >= num2) {
            System.out.println("Descending order: " + num1 + " " + num3 + " " + num2);
        } else if (num2 >= num1 && num1 >= num3) {
            System.out.println("Descending order: " + num2 + " " + num1 + " " + num3);
        } else if (num2 >= num3 && num3 >= num1) {
            System.out.println("Descending order: " + num2 + " " + num3 + " " + num1);
        } else if (num3 >= num1 && num1 >= num2) {
            System.out.println("Descending order: " + num3 + " " + num1 + " " + num2);
        } else {
            System.out.println("Descending order: " + num3 + " " + num2 + " " + num1);
        }

        s.close();
    }
}
