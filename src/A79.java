import java.util.Scanner;
/*2077study*/
/*既然最大的那个盘可以放在最上面，那就不用想汉诺塔III一样吧前n-1个盘全从1搬到3了。
只要从1搬到2，然后把第n个盘从1搬到2再搬到3，然后把这n-1个从2搬到3。
所以，问题转换成n个盘搬一步需要几次。但前n-1个盘和汉诺塔III的的规则是一样的。
所以，需要先把前n-2从1搬到3，然后把第n-1个盘从1搬到2，再把前n-2个盘从3搬到2。就完成了！
以为把n个盘按汉诺塔从1搬到3需要3^n - 1(推导见2064)。
所以把n-1个盘移动1步，需要f(n) = f(n-1) + 3n-1
而f(1) = 1
所以f(n) = 3^(n-1) + 3^(n-2) + ... + 3 + 1 = (3^n - 1) / 2
所以按汉诺塔IV的规则来，搬n个盘需要m(n) = 2 * f(n-1) + 2 = 3^(n-1) + 1 */
public class A79 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            int n=sc.nextInt();
            while (n-->0){
                int m=sc.nextInt();
                System.out.println((int)Math.pow(3,m-1)+1);
            }
        }
    }
}
