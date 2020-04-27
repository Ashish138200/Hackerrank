import java.util.Scanner;
public class Bitlang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n ;i++){
            String a=sc.next();
            int X=sc.nextInt();
            if(a.equals("++X")){
                X=X+1;
                System.out.println(X);
            }
            if(a.equals("X++")) System.out.println(X);
            if(a.equals("--X")) {
                X=X-1;
                System.out.println(X);
            }
            if(a.equals("X--")) System.out.println(X);
        }
    }
}

