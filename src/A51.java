import java.util.*;
/*2049*/
public class A51{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long []a=new long[21];
        a[1]=0;
        a[2]=1;
        for(int i=3;i<21;i++){
            a[i]=(i-1)*(a[i-2]+a[i-1]);			//错排表
        }
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            long r=zuhe(n-m,n);
            System.out.println(r*a[m]);		//（1）*（2）
        }
    }
    public static long zuhe(int x,int y){		//n-m对夫妇找对了，组合问题
        long sum1=1;
        long sum2=1;
        for(int i=1;i<=x;i++){
            sum1=sum1*i;
            sum2=sum2*(y-i+1);
        }
        return sum2/sum1;
    }
}

