import java.util.Scanner;
/*2073study*/
public class A75 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            while (n-->0){
                double x1=sc.nextDouble();
                double y1=sc.nextDouble();
                double x2=sc.nextDouble();
                double y2=sc.nextDouble();
                double t1,t2;
                double ans=0;
                //保证x2+y2>x1+y1
                if((x1+y1)>(x2+y2))	{
                    t1=x1;
                    x1=x2;
                    x2=t1;
                    t2=y1;
                    y1=y2;
                    y2=t2;
                }
                if((x1+y1)!=(x2+y2)) {
                    if (y1 != 0)
                        ans = ans + Math.sqrt(2 * y1 * y1);
                    for (int i = 1; i <= (x2 + y2 - x1 - y1); i++)
                        ans = ans + (x1 + y1 + i) * Math.pow(2.0, 0.5);
                    for (int i = 0; i < (x2 + y2 - x1 - y1); i++)
                        ans = ans + Math.pow((x1 + y1 + i) * (x1 + y1 + i) + (x1 + y1 + i + 1) * (x1 + y1 + i + 1), 0.5);
                    ans = ans - Math.pow(2 * y2 * y2, 0.5);
                }
                else
                    ans=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
                System.out.println(String.format("%.3f",ans));
            }
        }
    }
}
