import java.util.Scanner;

class Program3 {
    public static void main(String[] args) {
        int multiplicationNumbers = 1;
        System.out.println("Enter a five-digit number ");
        for (int i = 0; i < 2; i++) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int tempNumber = number;
            int digitsSum = 0;
            while (number != 0) {
                int tempValue = number % 10;
                digitsSum += tempValue;
                number /= 10;
            }
            int var = 2;
            while (digitsSum % var != 0) {
                var++;
            }
            if (var == digitsSum) {
                multiplicationNumbers *= tempNumber;
            }
            System.out.println("multiplicationNumbers " + multiplicationNumbers);
        }
    }
}
