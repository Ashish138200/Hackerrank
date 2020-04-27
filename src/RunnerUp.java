import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RunnerUp {
    static final int MAX_CHAR = 256;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zz = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < zz; i++) {
            String s[] = sc.nextLine().split("");
            Arrays.sort(s);
            HashMap<Integer, String> m = new HashMap<>();
            String ss = s[0];
            int c = 0;
            int j = -1;
            while (++j < s.length - 1) {
                if (j < s.length && ss.equals(s[j])) {
                    ++c;
                } else if (j < s.length && !ss.equals(s[j])) {
                    m.put(c, s[j - 1]);
                    ss = s[j];
                    c = 1;
                } else
                    m.put(c, s[j - 1]);
            }
            if (m.size() == 1)
                System.out.println("-1");
            else {
                int f = 1;
                for (Map.Entry<Integer, String> mm : m.entrySet()) {
                    if (f == m.size() - 1) {
                        System.out.println(mm.getValue());
                        break;
                    }
                    ++f;
                }
            }
        }
    }
}