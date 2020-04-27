import java.util.Scanner;

public class TheatreSq8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a=sc.nextInt();
        int rem= (m*n)%(a*a);
        System.out.println(rem);
    }
}
