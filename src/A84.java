import java.util.Arrays;
import java.util.Scanner;
/*2082pass 母函数基础题*/
/*比如:
(1 + x)n = C0n + C1nX^1 + ... + CnnX^n
所以，(1 + x)^n是序列C0n， C1n, ..., Cnn的母函数
用多项式的指数来代表某一属性(质量、分数、体积...)，前面的系数为它的种数。
本题就是求1->50的母函数的系数和。
*/
public class A84 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[27];
        //母函数系数
        int[] c=new int[55];
        //此轮母函数系数积累量
        int[] t=new int[55];
        while (n-->0){
            Arrays.fill(c,0);
            Arrays.fill(t,0);
            int s=0;
            for (int i=1;i<27;i++)
                a[i]=sc.nextInt();
            //对a字母的系数赋值
            for (int i = 0 ; i <= 50 && i <= a[1] ; i++)
                c[i] = 1;
            //处理每个字母的多项式
            for (int i = 2 ; i <= 26 ; i++) {
                //多项式每一项进行乘法计算
                for (int j = 0 ; j <= 50 ; j++)
                    //多项式的最后一项有两个限制
                    for (int k = 0 ; (j+k <= 50) && (k <= a[i] * i) ; k += i)
                        //合并同类项
                        t[j+k] += c[j];
                //赋值并清零
                for (int j = 0 ; j <= 50 ; j++) {
                    c[j] = t[j];
                    t[j] = 0;
                }
            }
            for (int i = 1 ; i <= 50 ; i++)
                s += c[i];
            System.out.println(s);
        }
    }
}
