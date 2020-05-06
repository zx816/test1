import java.util.*;
/*2049pass 假设一共有N对新婚夫妇,其中有M个新郎找错了新娘,求发生这种情况
一共有多少种可能*/
public class A51{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long []a=new long[21];
        // 错排公式：M[i]=(i-1)(M[i-1]+M[i-2])，特殊的 ：M[1]=0,M[2]=1。
        // 我们只需要计算从n个新郎中 找出m个的组合数乘以m个错排的组合数就行了。
        a[1]=0;a[2]=1;
        for(int i=3;i<21;i++){
            a[i]=(i-1)*(a[i-2]+a[i-1]);
        }
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            long r=zuhe(n-m,n);
            System.out.println(r*a[m]);
        }
    }
    /*组合数公式：C(n,r)=A(n,r)/r!
      n-m对夫妇找对了，组合问题*/
    public static long zuhe(int x,int y){
        long sum1=1;
        long sum2=1;
        for(int i=1;i<=x;i++){
            sum1=sum1*i;
            sum2=sum2*(y-i+1);
        }
        return sum2/sum1;
    }
}

