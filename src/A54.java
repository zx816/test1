import java.util.Scanner;
/*2052pass*/
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
