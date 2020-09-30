import java.util.Scanner;

class Program2_1 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int arraySum = 0;
        System.out.println("Enter array elements ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            arraySum += array[i];
        }
        System.out.println("Sum of array elements = " + arraySum);
    }
}
