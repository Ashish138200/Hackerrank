// test case 3 failed
import java.util.Scanner;
public class SoldiersAndBananas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        if(1<=k && w<=1000 && n<=109 && n>=0){
            int m=0;
            int tc=0;
            for (int i = 1; i <= w; i++) {
                tc=tc+i*k;
                m=tc-n;
            }
            if(tc==n){
                System.out.println(0);
            }
            else{
                System.out.println(m);
            }

        }
    }
}
