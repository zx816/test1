import java.util.Arrays;
import java.util.Scanner;
/*2000pass*/
public class A2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=null;
        while (sc.hasNext()){
            s=sc.next();
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            System.out.print(chars[0]+" "+chars[1]+" "+chars[2]);
            System.out.println();
        }
    }
}
