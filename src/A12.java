import java.util.Scanner;
/*2010pass 水仙花数
  简单题 特殊的数*/
public class A12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        while (sc.hasNext()){
            int a,b,c;
            m=sc.nextInt();
            n=sc.nextInt();
            int j=0;
            for (int i=m;i<=n;i++){
                a=i/100;
                b=i/10%10;
                c=i%10;
                if (i==a*a*a+b*b*b+c*c*c) {
                    j++;
                    if (j==1)
                        System.out.print(i);
                    else
                        System.out.print(" "+i);
                }
            }
            if (j==0)
                System.out.println("no");
            else
                System.out.println();
        }
    }
}
