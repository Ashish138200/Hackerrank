import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                if (a[j] <= s) {

                }
            }
        }
    }
}
