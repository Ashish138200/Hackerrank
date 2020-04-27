import java.util.Arrays;
import java.util.Scanner;

public class MaxIsBetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = scanner.nextInt();
            }
            Arrays.sort(array);
            System.out.println(array[array.length - 1] - array[0]);
        }
    }
}
