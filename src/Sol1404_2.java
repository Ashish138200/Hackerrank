import java.util.Scanner;

public class Sol1404_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String s= Integer.toString(n);
        char[] arr={'0','1','2','3','5','6','9','8','0'};
        char[] ss=s.toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < ss.length; j++) {
                if (arr[i] == ss[j]) {
                    System.out.println("NO");
                    break;
                }
                else{
                    System.out.println("YES");
                    break;
                }
            }
        }
            /*if ((s.contains("4") && s.contains("7")) || ((n % 4 == 0) || n % 7 == 0) || n % 47 == 0) {
                System.out.println("YES");
            }*/

        }
}
