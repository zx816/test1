import java.util.Scanner;
/*2059study 动态规划(dp)*/
public class A61 {
    static int L;
    static int N,C,T;
    static int VR,VT1,VT2;
    static int p[]= new int [102];
    static double dp[]=new double [105];
    static void dp(){
        double ans,min;
        for(int i=0;i<105;i++)
            dp[i]=-1;
        dp[0]=0;
        //动态规划
        /*考察动态规划，状态转移方程可以这么推导：
          把起点和终点放入供电站的数组中，然后从1 ~ n + 1进行动态规划。
          在第 i 个供电站，从1 ~ i - 1 进行搜索，即在这些供电站充电（1 ~ i - 1 已经推出，是最优解），然后依次更新 dp [ i ] 。
          动态转移方程：
          若 c >= dis[ i ] - dis [ j ] =========>  dp[ i ] = min (dp[ i ] , t + dp[ j ] + (dis[ i ] - dis[ j ]) / v1)
          否则： dp[ i ] = min (dp[ i ] ,t + dp[ j ] + c / v1 + (dis[ i ] - dis[ j ] - c) / v2);
         */
        for(int i=1;i<N+2;i++){
            min = 100000;
            //在充满电的情况下从j点到i点的最短时间
            for(int j=0;j<i;j++){
                int len=p[i]-p[j];
                if(len>C)
                    ans=1.0*C/VT1+(len-C+0.0)/VT2;
                else
                    ans=1.0*len/VT1;
                ans+=dp[j];
                //在非起点站充电需花时间
                if(j!=0)
                    ans+=T;
                if(min>ans)
                    min=ans;
            }
            dp[i]=min;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //跑道的总长度
            L = sc.nextInt();
            //充电站个数
            N = sc.nextInt();
            //充完电可跑的距离
            C = sc.nextInt();
            //每次充电的时间
            T = sc.nextInt();
            //兔的速度
            VR = sc.nextInt();
            //开电动车的速度
            VT1 = sc.nextInt();
            //蹬电动车的速度
            VT2 = sc.nextInt();
            for (int i = 1; i <= N; i++) {
                //每个充电站距离
                p[i] = sc.nextInt();
            }
            p[0] = 0;
            p[N + 1] = L;
            dp();
            if (1.0 * L / VR < dp[N + 1])
                System.out.println("Good job,rabbit!");
            else
                System.out.println("What a pity rabbit!");
        }
    }
}
