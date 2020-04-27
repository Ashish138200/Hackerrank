import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] x=new int[size];
        int[] a=new int[size];
        for (int i = 0; i < size; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i <size ; i++) {
            for (int j = i+1; j < size; j++) {
                if (a[i]==a[j]){
                    x[i]=a[i];
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            if((x[i])!=0) System.out.println(x[i]);
        }
    }
}
