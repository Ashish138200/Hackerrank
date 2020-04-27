import java.util.Scanner;
public class VasyaEquil {
    private static int[] res;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,b,c;
        int s=0,t=0,u=0;
        for(int i=0;i<n;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            s=s+a;
            t=t+b;
            u=u+c;
        }
        if(t==0&&s==0&&u==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
