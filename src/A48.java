import java.util.Scanner;
/*2046*/
public class A48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long[] a=new long[51];
        a[1]=1;a[0]=1;
        for (int i=2;i<51;i++)
            a[i]=a[i-1]+a[i-2];
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(a[n]);
        }
    }
}
