import java.util.Arrays;
import java.util.Scanner;

class Program2_4 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int min, max, minIndex = 0, maxIndex = 0;

        System.out.println("Enter array elements ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
//            max = Math.max(max,array[i]);  поиск максимального значения
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        array[minIndex] = array[minIndex] + array[maxIndex] - (array[maxIndex] = array[minIndex]);
        System.out.println(Arrays.toString(array));
    }
}
