import java.util.Scanner;
/*2059study*/
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
        for(int i=1;i<N+2;i++){
            min = 100000;
            for(int j=0;j<i;j++){
                int len=p[i]-p[j];
                if(len>C)
                    ans=1.0*C/VT1+(len-C+0.0)/VT2;
                else
                    ans=1.0*len/VT1;
                ans+=dp[j];
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
            L = sc.nextInt();
            N = sc.nextInt();
            C = sc.nextInt();
            T = sc.nextInt();
            VR = sc.nextInt();
            VT1 = sc.nextInt();
            VT2 = sc.nextInt();
            for (int i = 1; i <= N; i++) {
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
