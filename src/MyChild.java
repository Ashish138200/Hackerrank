import java.util.Scanner;

public class MyChild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = "";
        String a = "";
        for (int i = 1; i <= t; i++) {
            s = sc.next();
            a = sc.next();
            if (s.contains(a) == true) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}