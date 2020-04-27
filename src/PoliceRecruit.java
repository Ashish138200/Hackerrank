import java.util.Scanner;

public class PoliceRecruit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pm=0;
        int c=0;
        int ar=0;
        for(int i=0;i<n;i++){
            ar=sc.nextInt();
            if(ar>0){
                pm++;
            }
            if(ar<=0){
                if(pm<=0)
                    c++;
                else
                    pm--;
            }
        }
        System.out.println(c);
    }
}
