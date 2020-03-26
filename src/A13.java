import java.text.DecimalFormat;
import java.util.Scanner;
/*2011pass*/
public class A13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.00");
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
            System.out.println(df.format(m));
        }
    }
}
