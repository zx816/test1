import java.util.Scanner;
/*2052pass 给你一个矩形的宽和长，把它画出来。
简单的模拟题。
*/
public class A54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            System.out.print("+");
            for (int j=0;j<n;j++)
                System.out.print("-");
            System.out.print("+");
            System.out.println();
            for (int h=0;h<m;h++) {
                System.out.print("|");
                for (int l=0;l<n;l++)
                    System.out.print(" ");
                System.out.println("|");
            }
            System.out.print("+");
            for (int j=0;j<n;j++)
                System.out.print("-");
            System.out.println("+");
            System.out.println();
        }
    }
}
