import java.util.Scanner;
class Program1 {
    public static void main(String[] args) {
        int digitsSum = 0;
        int tempValue = 0;
        System.out.println("Enter a five-digit number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        digitsSum = (number / 10000);
        number%=10000;

        tempValue = number / 1000;
        digitsSum += tempValue;
        number %= 1000;

        tempValue = number / 100;
        digitsSum += tempValue;
        number%=100;
        tempValue = number / 10;
        digitsSum+=tempValue;
        number%=10;
        digitsSum+=number;
        System.out.println("digitsSum " + digitsSum);
    }
}
