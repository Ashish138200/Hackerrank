import java.util.Arrays;
import java.util.Scanner;

public class MinVsMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for(int i=1;i<=T;i++){
            int N=sc.nextInt();
            int[] arr=new int[N];
            for(int j=0;j<N;j++)
                arr[j]=sc.nextInt();
            Arrays.sort(arr);
            System.out.println("Min="+arr[0]+" "+"Max="+arr[arr.length-1]);
        }
        }
        
    }

