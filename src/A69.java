import java.util.Scanner;
/*2067递推pass 这是一张关于对角线对称的图。所有我们只要求一个方向的值，然后乘以2即可。
我们就拿下三角来考虑。不难发现，所有在0列上的格子，路径数都是1(只能从上面过来)。
而其他格子则都是由上、左两个方向过来，即:f(i, j) = f(i - 1, j) + f(i, j - 1);
另外f(i, i) = f(i, j - 1); */
public class A69{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        /*for(int i=0; i<=35; i++)
		     flag[0][i] = 1;
	      for(int i=1; i<=35; i++)
		      for(int j=1; j<=35; j++)
			    if(i == j)
				    flag[i][j] = flag[i-1][j];
			    else
				    flag[i][j] = flag[i-1][j] + flag[i][j-1]
		*/
        long[] a=new long[36];
        //按列来看
        a[0]=1;
        long[] b=new long[36];
        b[0]=0;
        for (int i=1;i<36;i++){
            for (int j=1;j<i;j++)
                a[j]+=a[j-1];
            b[i]=a[i]=a[i-1];
        }
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if(n == -1)
                break;
            System.out.println(count+" "+n+" "+2*b[n]);
            count++;
        }
    }
}
