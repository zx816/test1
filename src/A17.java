import java.util.Scanner;
/*2015pass 有一个长度为n(n<=100)的数列，该数列定义为从2开始的递增有
序偶数，现在要求你按照顺序每m个数求出一个平均值 数学题*/
public class A17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        while (sc.hasNext()){
            n=sc.nextInt();
            m=sc.nextInt();
            for (int i=1;i<=n;i=i+m){
                int k=0;
                int sum=0;
                for (int j=i;k<m&&j<=n;j++){
                    sum=sum+2*j;
                    k++;
                }
                if (i==1)
                    System.out.print(sum/k);
                else
                    System.out.print(" "+sum/k);
            }
            System.out.println();
        }
    }
}
