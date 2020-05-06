import java.util.Scanner;
/*2064study 现在我们改变游戏的玩法，不允许直接从最左(右)边移到最右(左)边
(每次移动一定是移到中间杆或从中间移出)，也不允许大盘放到下盘的上面。
设f(n)为把n个盘从1移到3所需要的步数，当然也等于从3移到1的步数。
看什么的图就知道，要想把第n个盘从1移到3，需要想把前n-1个从1移动3，再从3->1最后再1->3。
而第n个盘要从1->2->3经历2步。
 */
public class A66 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long[] a=new long[36];
        a[1]=2;
        for (int i=2;i<=35;i++)
            a[i]=3*a[i-1]+2;
        while (sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println(a[n]);
        }
    }
}
