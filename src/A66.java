import java.util.Scanner;
/*2064study*/
public class A66 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long[] a=new long[36];
        a[1]=2;
        for (int i=2;i<=35;i++)
            a[i]=3*a[i-1]+2;
        while (sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println(a[n]);
        }
    }
}
