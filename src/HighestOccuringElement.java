import java.util.Arrays;
import java.util.Scanner;

public class HighestOccuringElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;
        char[] a=s.toCharArray();
        Arrays.sort(a);
        char b=' ';
        for (int i = 0; i <a.length ; i++) {
            int c1=0;
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]==a[j]){
                    c1++;
                }
            }
            if(c<c1){
                c=c1;
                b=a[i];
            }
        }
        System.out.println(b);
    }
}
