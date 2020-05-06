import java.util.Scanner;
/*2053be smart有一些灯排成一条直线。所有的灯在刚开始都是关闭的，在对灯
进行一系列操作后:在第i次操作的时候，调整所有标号是i的倍数的灯的状态
(原本打开的灯将它关闭，原本关闭的将它打开)。*/
public class A55 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int[] a=new int[n+1];
            for (int j=1;j<n+1;j++) {
                if (n%j==0) {
                    if (a[n]==0)
                        a[n]=1;
                    else if (a[n]==1)
                        a[n]=0;
                }
            }
            System.out.println(a[n]);
        }
    }
}
