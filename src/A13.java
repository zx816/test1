import java.util.Scanner;
/*2011pass 多项式的描述如下：
1 - 1/2 + 1/3 - 1/4 + 1/5 - 1/6 + ...
数学题*/
public class A13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n;
        for (int i=0;i<x;i++){
            n=sc.nextInt();
            double m=0;
            for (int j=1;j<=n;j++){
                if (j%2==1)
                    m=m+1.0/j;
                else
                    m=m-1.0/j;
            }
            System.out.println(String.format("%.2f",m));
        }
    }
}
