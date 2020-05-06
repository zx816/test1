import java.util.Scanner;
import static java.lang.Math.max;
/*2084pass*/
/*从顶点出发时到底向左走还是向右走应取决于是从左走能取到最大值还是从右走能取到最大值，只要左右两道路径上的最大值求出来了才能作出决策。同样的道理下一层的走向又要取决于再下一层上的最大值是否已经求出才能决策。这样一层一层推下去，直到倒数第二层时就非常明了。
所以第一步对第五层数据，做如下决策：选择左边的数还是右边的数
经过一次决策，问题降了一阶。5层数塔问题转换成4层数塔问题，如此循环决策…… 最后得到1阶的数塔问题。
*/
public class A86{
    //存储动态规划过程中的数据
    static int[][] dp=new int[101][101];
    static int[][] g=new int[101][101];
    static int k;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0){
            k=sc.nextInt();
            for (int i=0;i<k;i++){
                for (int j=0;j<=i;j++)
                    g[i][j]=sc.nextInt();
            }
            for (int i = 0; i < k; ++i) {
                //数塔最后一行赋值
                dp[k - 1][i] = g[k - 1][i];
            }
            int temp;
            for (int i = k - 1; i >= 0; --i) {
                for (int j = 0; j <= i; ++j) {
                    // 使用递推公式计算dp的值 自底向上计算
                    temp = max(dp[i + 1][j], dp[i + 1][j + 1]);
                    dp[i][j] = temp + g[i][j];
                }
            }
            System.out.println(dp[0][0]);
        }
    }
}

