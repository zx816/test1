import java.util.Scanner;
/*2079wrong*/
public class A81 {
    static int n,s,k;
    static int[] a=new int[10];
    static int[] b=new int[10];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int T=sc.nextInt();
            while (T-->0){
                n=sc.nextInt();
                k=sc.nextInt();
                s=0;
                for (int i=0;i<k;i++){
                    a[i]=sc.nextInt();
                    b[i]=sc.nextInt();
                }
                f(1,0);
                System.out.println(s);
            }
        }
    }
    public static void f(int t,int sum){
        for(int i=0;i<=b[t];i++){
            sum += i*a[t];
            if(sum>n){
                sum -= i*a[t];
                continue;
            }
            if(sum == n)s++;
            else if(t<k)f(t+1,sum);
            sum -= i*a[t];
        }
    }
}
