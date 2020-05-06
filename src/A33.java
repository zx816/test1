import java.util.Scanner;
/*2031 输入一个十进制数N，将它转换成R进制数输出. 巧用ascii*/
public class A33 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        while (sn.hasNext()) {
            int n = sn.nextInt();// 十进制数n
            int r = sn.nextInt();// R进制数r
            String s = "";
            if (n < 0) { // 变为正数
                n = -n;
                System.out.print("-");
            }
            char a = 'A';
            int b = a;  //A的ASSIC码
            while (n > 0) {
                int t = n % r;
                if (t >= 10) {
                    int c = t - 10 + b;
                    char d = (char) c;
                    s = d + s;
                } else
                    s = t + s;
                n = n / r;
            }
            System.out.println(s);
        }
    }
}
