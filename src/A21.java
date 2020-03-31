import java.util.Arrays;
import java.util.Scanner;
/*2019pass
  插入排序代码有误*/
public class A21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        while (sc.hasNext()){
            n=sc.nextInt();
            m=sc.nextInt();
            if (n==0&&m==0)
                break;
            else {
                int[] a=new int[n+1];
                for (int i=0;i<n;i++)
                    a[i]=sc.nextInt();
                a[n]=m;
                Arrays.sort(a);
                System.out.print(a[0]);
                for (int h=1;h<n+1;h++)
                    System.out.print(" "+a[h]);
                System.out.println();
            }
        }
    }
}
