// runtime error
import java.util.Scanner;
public class LuckyFour3 {
    static int[] a=new int[106];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            for (int j = 0; j <t ; j++) {
                a[j]=sc.nextInt();
            }
            for (int j = 0; j <t ; j++) {
                System.out.println(four(a[j], 4));
            }
        }
    }
    static int four(int n,int d){
        int c=0;
        while(n>0){
            if(n%10==d){
                c++;
            }
            n=n/10;
        }
        return c;
    }
}
