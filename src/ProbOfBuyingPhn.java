import java.util.Scanner;

public class ProbOfBuyingPhn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p1=sc.nextInt();
        int p2=sc.nextInt();
        int p3=sc.nextInt();
        int a=sc.nextInt();
        if(a<p1 && a<p2 && a<p3){
            System.out.println("0");
            System.out.println("0");
            System.out.println("0");
        }
        if(a<p1){
            System.out.println("0");
            System.out.println("0.50");
            System.out.println("0.50");
        }
        if(a<p2){
            System.out.println("0.50");
            System.out.println("0");
            System.out.println("0.50");

        }
        if(a<p3){
            System.out.println("0.50");
            System.out.println("0.50");
            System.out.println("0");
        }
        if(a<p1 && a<p2 && a>p3){
            System.out.println("0");
            System.out.println("0");
            System.out.println("1");
        }
        if(a<p1 && a>p2 && a<p3){
            System.out.println("0");
            System.out.println("1");
            System.out.println("0");
        }
        if(a>p1 && a<p2 && a<p3){
            System.out.println("1");
            System.out.println("0");
            System.out.println("0");
        }
        if(a>p1 && a>p1 && a>p3){
            System.out.println("0.33");
            System.out.println("0.33");
            System.out.println("0.33");
        }
    }


}
