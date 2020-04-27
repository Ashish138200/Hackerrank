//runtime error and error
import java.text.DecimalFormat;
import java.util.Scanner;
public class TotalExpense {
    static int[] d=new int[1000];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            for (int j = 0; j < 2; j++) {
                d[j]=sc.nextInt();
            }
            for (int j = 1; j <t; j++) {
                System.out.println(te(d[j-1],d[j]));
                j++;
            }
        }
    }
    static String te(int a, int b){
        DecimalFormat dec=new DecimalFormat("#0.000000");
        int res=a*b;
        if(a>1000){
            res=res-(int)(0.10*res);
        }
        return dec.format(res);
    }
}
