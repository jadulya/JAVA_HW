import java.util.Scanner;

class Program2 {
    public static void main(String[] args) {
        long binaryNumber = 0;
        System.out.println("Enter a five-digit number ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        binaryNumber += number % 2;
        number /= 2;
        binaryNumber += number % 2 * 10;
        number /= 2;
        binaryNumber += number % 2 * 100;
        number /= 2;
        binaryNumber += number % 2 * 1000;
        number /= 2;
        binaryNumber += number % 2 * 10000;
        number /= 2;
        binaryNumber += number % 2 * 100000;
        number /= 2;
        binaryNumber += number % 2 * 1000_000L;
        number /= 2;
        binaryNumber += number % 2 * 10_000_000;
        number /= 2;
        binaryNumber += number % 2 * 1_000_000_00;
        number /= 2;
        binaryNumber += number % 2 * 1_000_000_000;
        number /= 2;
        binaryNumber += number % 2 * 10_000_000_000L;
        number /= 2;
        binaryNumber += number % 2 * 10_0000_000_000L;
        number /= 2;
        binaryNumber += number % 2 * 1_000_000_000_000L;
        number /= 2;
        binaryNumber += number % 2 * 10_000_000_000_000L;
        number /= 2;
        binaryNumber += number % 2 * 100_000_000_000_000L;
        number /= 2;
        binaryNumber += number % 2 * 1_000_000_000_000_000L;
        number /= 2;
        binaryNumber += number % 2 * 10_000_000_000_000_000L;
        number /= 2;
        System.out.println("binarynumber " + binaryNumber);
    }
}