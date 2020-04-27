import java.io.IOException;
import java.util.Scanner;

public class Students {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int gcd=1;
        for(int i=0;i<T;i++){
            int[] arr=new int[2];
            for(int j=0;j<arr.length;j++)
                arr[j]=sc.nextInt();
            for(int k=1;k<=arr[0] &&k<=arr[1];++k){
                if(arr[0]%k==0 && arr[1]%k==0){
                    gcd=k;
                }
            }
            if(gcd>1)
                System.out.println(arr[0]/gcd+" "+arr[1]/gcd);
            else
                System.out.println("Not Possible");

    }
}
}
