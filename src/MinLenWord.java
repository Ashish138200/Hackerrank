import java.util.Arrays;
import java.util.Scanner;

public class MinLenWord{
    /*public static void minlen(String s) {
        String ml="",word="";
        String[] words = new String[100];
        int length = 0;
        s=s+" ";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                word = word + s.charAt(i);
            }
            else{
                words[length] = word;
                length++;
                word = "";
            }
        }
        ml=words[0];
        for (int i = 0; i <words.length ; i++) {
                if (ml.length() > words[i].length()) {
                    ml = words[i];
                }
            }

        System.out.println(ml);
        }*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
         /*MinLenWord mlw=new MinLenWord();
        mlw.minlen(s);*/
        //String s="hello hii h hii";
        String[] ss=s.split(" ");
        Arrays.sort(ss);
        System.out.println(ss[0]);
    }
}
