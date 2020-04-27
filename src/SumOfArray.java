import java.io.IOException;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=0;
        int m=0;
        int z=Math.max(m,n);
        int[] a=new int[z];
        int[] b=new int[z];
        // array 1
        n=sc.nextInt();
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        //array 2
        m=sc.nextInt();
        for(int i=0;i<m;i++)
            b[i]=sc.nextInt();

        int x=Math.max(n,m)+1;
        int[] c=new int[x];
        int carry=0,s=0;
        for(int i=x-1;i>=0;i--){
            s=a[i]+b[i]+carry;
            c[i]=s%10;
            carry=s/10;
        }
        int ans=0;
        if(carry==1)
            ans=10;
        for(int i=0;i<x;i++){
            ans+=c[i];
            ans*=10;
        }
        String st=Integer.toString(ans);
        char[] ch=st.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
    }
}
