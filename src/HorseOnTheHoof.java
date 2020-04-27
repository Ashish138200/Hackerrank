import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HorseOnTheHoof {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Integer> i= new HashSet<>();
        for (int j = 1; j <=4 ; j++) {
            i.add(sc.nextInt());
        }
        System.out.println(4-i.size());
    }
}
