import java.util.Scanner;
/*2041pass 有一楼梯共M级，刚开始时你在第一级，若每次只能跨上一级或
二级，要走上第M级，共有多少种走法？
因此从第一级走上第二级只能走一步，只有1种走法。
从第一级走上第三级，可以从第一级直接走两步，也可以从第二级走一步。有2种走法
走上第n级，可以从第n-1级走一步上来，也可以从第n-2级走两步上来。*/
public class A43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[41];
        a[1]=1;a[2]=1;
        for (int i=3;i<41;i++)
            a[i]=a[i-1]+a[i-2];
        while (sc.hasNext()){
            int n=sc.nextInt();
            for (int j=0;j<n;j++){
                int m=sc.nextInt();
                System.out.println(a[m]);
            }
        }
    }
}
