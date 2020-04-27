import java.util.Scanner;

public class PerfectSq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            long n=sc.nextLong();
            double b=0.5;
            double res=  Math.pow(n,b);
            System.out.println(res);
            if((n / res) == res){
                System.out.println("Perfect Square");
            }
            else {
                System.out.println("Not a Perfect Square");
            }
        }
    }
}
