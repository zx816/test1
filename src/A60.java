import java.util.Scanner;
/*2058study 求数列部分和 硬解会超时*/
public class A60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int m=sc.nextInt();
            int n=sc.nextInt();
            if (m==0&&n==0)
                break;
            else {
                /*等差数列，公差为1，假设首项是a,项数是b；  等差数列求和公式：(a1+an)*n / 2;
                 * 则 M = (a + (a+b-1))*b /2 (M是部分和);
                 * 所以：2M = (a + (a+b-1))*b = (2a + b - 1)*b
                 * 且:a>=1
                 * 所以：2M >= b^2
                 * 即：项数b <= 根号2M
                 */
                int len = (int) Math.sqrt(n * 2.0);
                int temp;
                /* M = (a + (a+b-1))*b /2;
			     * 2M = 2ab + b^2 -b
                 * 2ab = 2M - b^2 + b
                 * ab = (2M - b^2 + b) / 2 = M - (b^2 - b)/2;
			     * 令temp = ab;
			     * temp / a = b 项数
                 * temp / b = a 首项
                 */
                for (int i=len;i>=1;--i){   //i为项数
                    temp = n - (i * i - i) / 2;
                    if (temp % i == 0)
                        System.out.println("[" + (temp / i) + "," + (temp / i + i - 1) + "]");
                }
                System.out.println();
            }
        }
    }
}
