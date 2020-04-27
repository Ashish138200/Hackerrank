import java.util.Scanner;

public class WavePrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                a[j][i]=sc.nextInt();
            }
        }
        int row=a.length;
        int col=a[0].length;
        for(int i=0;i<col;i++){
            if(i%2==0){
                for( int j=0;j<row;j++){
                    System.out.print(a[j][i]+" ");
                }
            }
            else
                for(int j=row-1;j>=0;j--)
                    System.out.print(a[j][i]+" ");
        }
    }
}
