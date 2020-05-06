import java.util.*;
/*2065study 现在有一长度为N的字符串,满足一下条件:
(1) 字符串仅由A,B,C,D四个字母组成;
(2) A出现偶数次(也可以不出现);
(3) C出现偶数次(也可以不出现);
计算满足条件的字符串个数.
当N=2时,所有满足条件的字符串有如下6个:BB,BD,DB,DD,AA,CC.
由于这个数据肯能非常庞大,你只要给出最后两位数字即可。没搞懂*/
public class A67 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n==0)break;
            int sum[]=new int[n];
            for(int i=0;i<n;i++){
                long m=sc.nextLong();
                //n=4^(n-1)+2^(n-1)
                sum[i]=(fastPow(4,m-1)+fastPow(2,m-1))%100;
            }
            for(int i=0;i<n;i++) {
                System.out.println("Case " + (i + 1) + ": " + sum[i]);
            }
            System.out.println();
        }
    }
    static int fastPow(int a,long b){
        int s=1;
        while(b>0){
            if(b%2==1){
                s=s%100;
                a=a%100;
                s=s*a;
            }
            a=a%100;
            a=a*a;
            b >>=1;
        }
        return s%100;
    }
}