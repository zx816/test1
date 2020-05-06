import java.util.Scanner;
/*2085pass 简单题按题意套公式*/
public class A87 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            if (n==-1){
                System.out.println();
                break;
            }
            //高能质子
            long[] a=new long[n+1];
            //低能质子
            long[] b=new long[n+1];
            a[0]=1;
            b[0]=0;
            for (int i=1;i<=n;i++){
                a[i]=a[i-1]*3+b[i-1]*2;
                b[i]=a[i-1]+b[i-1];
            }
            System.out.println(a[n]+","+b[n]);
        }
    }
}
