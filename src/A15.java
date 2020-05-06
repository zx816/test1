import java.util.Scanner;
/*2013pass 一天悟空吃掉桃子总数一半多一个
到第n天准备吃的时候只剩下一个桃子。
帮悟空算一下，他第一天开始吃的时候桃子一共有多少个 数学题*/
public class A15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = 1;
            for (int i = 1; i < m; i++)
                n = 2 * (n + 1);
            System.out.println(n);
        }
    }
}
