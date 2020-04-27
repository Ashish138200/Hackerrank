import java.util.Arrays;
import java.util.Scanner;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int sum=0,c=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int max=a[n-1];
        for(int i=0;i<n;i++){
            if(max>a[i]){
                c=max-a[i];
                sum+=c;

            }
        }
        System.out.println(sum);
    }
}
