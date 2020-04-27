import java.util.Scanner;

public class STraversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String[] arr=s.split(" ");
        int n=arr.length;
        String[] uw = new String[n];
        int[] f=new int[n];
        int c=0;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]==arr[j]){
                    c++;
                    uw[i]=arr[i];
                }
                System.out.println("Hello");
                f[i]=c;
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(uw[i]+" : "+f[i]);
        }
    }
}
