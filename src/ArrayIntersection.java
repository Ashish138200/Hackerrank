import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int[] a1=new int[s1];
        for (int i = 0; i < s1; i++) {
            a1[i]=sc.nextInt();
        }
        int s2=sc.nextInt();
        int[] a2=new int[s2];
        for (int i = 0; i <s2 ; i++) {
            a2[i]=sc.nextInt();
        }
        int[] u =new int[s1+s2];
        if(s1>s2) {
            for (int i = 0; i < s1; i++) {
                for (int j = 0; j < s2; j++) {
                    if (a1[i] == a2[j]) {
                        u[i] = a1[i];
                    } else
                        System.out.println("-1");
                }
            }
        }
        else if(s2>s1){
            for (int i = 0; i < s1; i++) {
                for (int j = 0; j < s2; j++) {
                    if (a1[i] == a2[j]) {
                        u[i] = a1[i];
                    } else
                        System.out.println("-1");
                }
            }
        }
        for (int i = 0; i <u.length ; i++) {
            if(u[i]!=0)
            System.out.println(u[i]);
        }
    }
}
