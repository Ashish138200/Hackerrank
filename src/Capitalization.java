import java.util.Scanner;

public class Capitalization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()<=103){
            String output = s.substring(0, 1).toUpperCase() + s.substring(1);
            System.out.println(output);
        }
    }
}
