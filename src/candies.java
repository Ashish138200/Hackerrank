import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class candies {
    private static int n;
    private static String s;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        s = sc.nextLine();
        n = sc.nextInt();
        char[] arr=new char[s.length()];
        char[] brr=new char[s.length()];
        int f=0;
        int c=0;
        for(int i=1;i<=n;i++) {
            for (int j = 0; j < s.length(); j++) {
                arr[j] = s.charAt(j);
                brr[j] = s.charAt(j);
            }
        }
            for (int k = 0;  k<arr.length ; k++) {
                for (int l = 0; l <k ; l++) {
                    if(arr[k]==brr[l]) {
                        f++;
                    }
                    else{
                        c++;
                    }
                }
            }

        if(f==0){
            System.out.println(c);
    }
        }


    }
