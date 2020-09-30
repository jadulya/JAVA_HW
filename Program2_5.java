import java.util.Arrays;
import java.util.Scanner;

class Program2_5 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        boolean isSorted = false;
        System.out.println("Enter array elements ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    array[i] = array[i] + array[i + 1] - (array[i + 1] = array[i]);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
