import java.util.Scanner;
/*2048pass 首先，所有参加晚会的人员都将一张写有自己名字的字条放入抽奖箱中；
然后，待所有字条加入完毕，每人从箱中取一个字条；
最后，如果取得的字条上写的就是自己的名字，那么“恭喜你，中奖了！”
这次抽奖活动最后竟然没有一个人中奖！ 你能计算一下发生这种情况的概率吗？
*/
public class A50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        double[] ls = new double[21];
        ls[0] = 0; ls[1] = 0; ls[2] = 1;
        double[] gq = new double[21];
        gq[0] = 1; gq[1] = 1; gq[2] = 2;
        for(int j=3;j<21;j++) {
            //N张票的所有排列N！
            gq[j]=gq[j-1]*j;
            //N张票的错排方式（错排公式）
            ls[j]=(j-1)*(ls[j-1]+ls[j-2]);
        }
        for(int i = 0;i < a;i++) {
            int n = sc.nextInt();
            System.out.println(String.format("%.2f", (ls[n]/gq[n]*100)) + "%");
        }
    }
}
