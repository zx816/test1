import java.util.Scanner;
/*2092数学题
∵x + y = n
∴y = n - x
∵xy = m
∴(n - x) * x = m
∴x2 - nx + m = 0
∵m是整数，且xy = m
∴x、y都是整数。
∴要判断是否有整数解，就要判断方程:x2 - nx + m = 0的△是否为完全平方数。
 */
public class A94 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            if (n==0&&m==0)break;
            if (n*n-4*m>0&&n*n-4*m-((int)Math.sqrt(n*n-4*m))*((int)Math.sqrt(n*n-4*m))==0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
