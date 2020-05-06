import java.util.Scanner;
/*2045pass有排成一行的ｎ个方格，用红(Red)、粉(Pink)、绿(Green)三色涂每个格子，每格涂一
色，要求任何相邻的方格不能同色，且首尾两格也不同色．求全部的满足要求的涂法.
比如，在一涂好的n-1个格子里最后再插入一个格子，就得到了n个格子了。
因为已经填好n-1的格子中，每两个格子的颜色都不相同。
所以只能插入一种颜色。而n-1个格子一共有F[n-1]种填涂方法。所以从n-1格扩充到n格共有F(n-1)种方法。
若前n-1不合法，而添加一个后变成合法，即前n-2个合法，而第n-1个与第1个相同。
这时候有两种填法。
*/
public class A47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long ab[]=new long[60];
        ab[1]=3;ab[2]=6;ab[3]=6;
        for(int i=4;i<60;i++)
            ab[i]=ab[i-1]+ab[i-2]*2;
        while (sc.hasNext()){
            int a=sc.nextInt();
            System.out.println(ab[a]);
        }
    }
}
