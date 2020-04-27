import java.util.Arrays;
import java.util.Scanner;

public class CompressString {
    public static void Compress(String s){
        char[] a=s.toCharArray();
        int c1 = 0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    c1++;

                }
            }
            System.out.print(a[i]);
            if(c1>1) {
                System.out.print(c1);
                c1=0;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        CompressString cs=new CompressString();
        cs.Compress(s);
    }
}
