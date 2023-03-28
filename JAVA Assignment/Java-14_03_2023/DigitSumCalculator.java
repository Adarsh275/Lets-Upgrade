import java.util.Scanner;

public class DigitSumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digitSum = calculateDigitSum(number);

        System.out.println("The sum of digits of " + number + " is " + digitSum);

        scanner.close();
    }

    public static int calculateDigitSum(int number) {
        int digitSum = 0;
        while (number != 0) {
            int remainder = number % 10;
            digitSum += remainder;
            number /= 10;
        }
        return digitSum;
    }
}
