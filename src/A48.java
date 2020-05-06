import java.util.Scanner;
/*2046pass 在2×n的一个长方形方格中,用一个1× 2的骨牌铺满方格从图中也可以观察出来，
第N张牌的排列可以又N-1张牌的排列再在末尾加上一张竖的牌。这样依然合法。
也可以在N-2张合法排列的牌后面加上两张横着放的牌(如果竖着放就和上面一种重复了)。*/
public class A48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long[] a=new long[51];
        a[1]=1;a[2]=2;
        for (int i=3;i<51;i++)
            a[i]=a[i-1]+a[i-2];
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(a[n]);
        }
    }
}
