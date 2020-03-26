import java.util.*;
/*2065study*/
public class A67 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int length;
            int sum[]=new int[n];
            int num1,num2;
            if(n==0)break;
            for(int i=0;i<n;i++){
                long m=sc.nextLong();
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