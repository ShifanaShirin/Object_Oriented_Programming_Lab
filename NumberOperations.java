import java.util.Scanner;

public class NumberOperations {

    public void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public void checkPrime(int number) {
        if (number <= 1) {
            System.out.println(number + " is not prime.");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }
    }

    public void checkPerfectSquare(int number) {
        if (number < 0) {
            System.out.println(number + " is not a perfect square.");
            return;
        }
        int sqrt = (int) Math.sqrt(number);
        if (sqrt * sqrt == number) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        NumberOperations operations = new NumberOperations();
        operations.checkEvenOdd(num);
        operations.checkPrime(num);
        operations.checkPerfectSquare(num);

        scanner.close();
    }
}
