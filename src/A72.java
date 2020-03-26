import java.util.Scanner;
/*2070pass*/
public class A72 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long[] a=new long[52];
        a[0]=0;a[1]=1;
        for (int i=2;i<=51;i++)
            a[i]=a[i-1]+a[i-2];
        while (sc.hasNextInt()){
            int m=sc.nextInt();
            if (m==-1)break;
            System.out.println(a[m]);
        }
    }
}
