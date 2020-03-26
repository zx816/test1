import java.util.Scanner;
/*2013pass*/
public class A15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()) {
            int m = sc.nextInt();
            int n = 1;
            for (int i = 1; i < m; i++)
                n = 2 * (n + 1);
            System.out.println(n);
        }
    }
}
