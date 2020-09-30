import java.util.Scanner;

class Program3 {
    public static void main(String args[]) {
        int multiplicationNumbers = 1;
        System.out.println("Enter a five-digit number ");
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();
        System.out.println("Enter a five-digit number ");
        Scanner scanner2 = new Scanner(System.in);
        int number2 = scanner2.nextInt();
        System.out.println("Enter a five-digit number ");
        Scanner scanner3 = new Scanner(System.in);
        int number3 = scanner3.nextInt();
        System.out.println("Enter a five-digit number ");
        Scanner scanner4 = new Scanner(System.in);
        int number4 = scanner4.nextInt();
        int digitsSum1 = 0;
        while (number1 != 0) {
            int tempValue = number1 % 10;
            digitsSum1 += tempValue;
            number1 /= 10;
        }
        int digitsSum2 = 0;
        while (number2 != 0) {
            int tempValue = number2 % 10;
            digitsSum2 += tempValue;
            number2 /= 10;
        }
        int digitsSum3 = 0;
        while (number3 != 0) {
            int tempValue = number3 % 10;
            digitsSum3 += tempValue;
            number3 /= 10;
        }
        int digitsSum4 = 0;
        while (number4 != 0) {
            int tempValue = number4 % 10;
            digitsSum4 += tempValue;
            number4 /= 10;
        }
        System.out.println(multiplicationNumbers);
        int var = 2;
        while (var * var <= digitsSum1) {
            if (digitsSum1 % var == 0) {
                break;
            }
            multiplicationNumbers *= digitsSum1;
            var++;
        }
//        if (var == number1) {
//            System.out.println(number1 + " is a prime number.");
//        } else
//            System.out.println(number1 + " is a not prime number.");
    }
}
