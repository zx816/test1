import java.util.Scanner;
/*2086pass 用数学归纳法推导公式*/
public class A88 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            double[] c=new double[n+1];
            double a0=sc.nextDouble();
            //b即为原式an+1
            double b=sc.nextDouble();
            for (int i=1;i<=n;i++)
                c[i]=sc.nextDouble();
            double sum=n*a0+b;
            for (int i=1;i<=n;i++)
                sum-=2*i*c[n-i+1];
            System.out.println(String.format("%.2f",sum/(n+1)));
        }
    }
}
