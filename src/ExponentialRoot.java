import java.util.Scanner;
class ExpontentialRoot{
    public static long Exp(long pow) {
        long sum = 0;
        while (pow != 0) {
            sum = sum + (pow % 10);
            pow = pow / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        long pow = (long)Math.pow(a,b);
        long res= Exp(pow);
        int len= String.valueOf(res).length();
        if(len>1) {
            System.out.println(Exp(res));
        }

    }
}
