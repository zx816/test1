import java.util.Scanner;
/*2089超时*/
public class A91 {
    static int[] a=new int[1000000];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            if (m==0&&n==0)break;
            int b;
            for (int c = 0,i = 1; i < 1000000; i += b)
            {
                b = A(i);
                if (b==0) c += b = 1;
                for (n = 0; n < b; n++)
                    a[i + n] = c;
            }
            System.out.println(a[m]-a[n-1]);
        }
    }
    static int A(int n)
    {
        int i = 1;
        while (n!=0) {
            if (n % 10 == 4 || n % 100 == 62)
                return i;
            n /= 10;
            i *= 10;
        }
        return 0;
    }
}
