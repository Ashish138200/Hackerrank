// test case 3 failed
import java.util.Scanner;
public class Team7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int k=0;
        int[] arr=new int[3];
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <3 ; j++) {
                arr[j]=sc.nextInt();
            }
            for (int j = 0; j < 3; j++) {
                if(arr[j]==1){
                    c++;
                }
            }
            if(c>=2){
                k++;
                c=0;
            }
        }
        System.out.println(k);
        c=0;
    }
}
