import java.text.DecimalFormat;
import java.util.Scanner;

public class MoneyForATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DecimalFormat dec=new DecimalFormat("#0.00");
        String[] s=new String[2];
        for (int i = 0; i <2 ; i++) {
            s[i] = sc.next();
        }
        int x=Integer.parseInt(s[0]);
        double y=Double.parseDouble(s[1]);
        if(x%5==0 && y>0){
            if(x>(int)y){
                System.out.println(dec.format(y));
            }
            else {
                y = y - x - 0.50;
                System.out.println(dec.format(y));
            }
        }
        else
            System.out.println(dec.format(y));
    }
}
