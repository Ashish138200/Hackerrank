//test case 3 failed
import java.util.Scanner;
public class FindUnique {
    static int findUni(int a[], int n, int k)
        {
            byte sizeof_int = 4;
            int INT_SIZE = 8 * sizeof_int;
            int count[] = new int[INT_SIZE];
            for (int i = 0; i < INT_SIZE; i++)
                for (int j = 0; j < n; j++)
                    if ((a[j] & (1 << i)) != 0)
                        count[i] += 1;
            int res = 0;
            for (int i = 0; i < INT_SIZE; i++)
                res += (count[i] % k) * (1 << i);
            return res;
        }
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int size=(2*n)+1;
            int[] a=new int[size];
            for (int i = 0; i <n ; i++) {
                a[i]=sc.nextInt();
            }
            int k = 2;
            System.out.println(findUni(a, size, k));
        }
    }
