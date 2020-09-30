import java.util.Scanner;

class Program2_6 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int number = 0, pow = 0;
        System.out.println("Enter array elements ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            pow = n - i - 1;
            number += array[i] * (int) (Math.pow(10, pow));
        }
        System.out.println("number " + number);
    }
}