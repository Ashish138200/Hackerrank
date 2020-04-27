import java.util.Scanner;

public class Sol1404_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        String s=sc.next();
        char ch=s.charAt(0);
        for(int i=1;i<n;i++){
            if(s.charAt(i)==ch)
                count++;
            else
                ch=s.charAt(i);
        }
        System.out.println(count);
    }
}
