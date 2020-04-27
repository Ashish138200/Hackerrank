import java.util.Scanner;

public class ZeroesToEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=0){
                System.out.print(arr[j]+" ");
            }
            else{
                c++;
            }
        }
        for(int k=1;k<=c;k++){
            System.out.print("0 ");
        }

    }
    }

