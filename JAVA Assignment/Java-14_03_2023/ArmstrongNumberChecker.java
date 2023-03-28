import java.util.Scanner;

public class ArmstrongNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int digitCount = 0;
        int sum = 0;

        // Count the number of digits in the number
        while (number != 0) {
            digitCount++;
            number /= 10;
        }

        // Calculate the sum of the cubes of each digit
        number = originalNumber;
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digitCount);
            number /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }
}
