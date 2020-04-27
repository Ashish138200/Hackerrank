// 2 test cases failed
import java.util.Scanner;
public class Panagram {
    public static void pan(int n,String s){
        boolean[] al=new boolean[26];
        int ind=0;
        int f=1;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='A' && s.charAt(i)=='Z'){
                ind=s.charAt(i) - 'A';
            }
            else if(s.charAt(i)=='a' && s.charAt(i)=='z'){
                ind=s.charAt(i)- 'a';
            }
            al[ind]=true;
        }
        for (int i = 1; i <=25 ; i++) {
            if(al[i]==false)
                f=0;
        }
        if(f==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.nextLine();
        pan(n,s);
    }
}
