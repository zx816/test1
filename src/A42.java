import java.util.Scanner;
/*2040pass 亲和数 特殊的数*/
public class A42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                int sum1=0;
                int sum2=0;
                //求真约数
                for (int j=1;j<=a/2;j++){
                    if (a%j==0)
                        sum1+=j;
                }
                for (int j=1;j<=b/2;j++){
                    if (b%j==0)
                        sum2+=j;
                }
                if (sum1==b&&sum2==a)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
