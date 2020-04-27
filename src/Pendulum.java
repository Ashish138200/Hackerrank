import java.util.Arrays;
import java.util.Scanner;

public class Pendulum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            int[] brr=new int[n];
            for (int j = 0; j <n ; j++) {
                brr[(n-1)/2]=arr[0];
                for (int k = n; k < 1; k--) {
                    brr[k]=arr[k];
                }
            }
            System.out.println(brr);
        }
    }
}
