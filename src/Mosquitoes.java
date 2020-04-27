import java.util.Scanner;

public class Mosquitoes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        double R,S,V,D,P,B,H,s,t;
        for(int i=1;i<=T;i++){
            R=sc.nextDouble();
            S=sc.nextDouble();
            V=sc.nextDouble();
            D=V*S;
            P=Math.pow(R,2);
            B=Math.pow(D,2);
            H=Math.sqrt(P+B);
            s=H-R;
            t=s/V;
            System.out.println(t);
        }
    }
}
