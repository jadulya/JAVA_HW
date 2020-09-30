import java.util.Scanner;

class Program2_3 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        float arrayAverage = 0;
        System.out.println("Enter array elements ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            arrayAverage += array[i];
        }
        System.out.println("Average of the array =  " + arrayAverage / n);
    }
}