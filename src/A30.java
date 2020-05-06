import java.util.Scanner;
/*2028 借鉴 非硬解 欧几里得算法*/
public class A30{
    //最大公约数
    public static long gcd(long u, long v) {
        long remainder = v;
        while(u % v != 0) {
            remainder = u % v;
            u = v;
            v = remainder;
        }
        return remainder;
    }
    //最小公倍数
    static long lcm(long u, long v) {
        return (u * v) / gcd(u, v);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        long u = 1, v;
        while(s.hasNext()) {
            n = s.nextInt();
            for(int i=0; i<n; ++i) {
                if(i == 0) {
                    u = s.nextInt();
                }
                else {
                    v = s.nextInt();
                    try {
                        u = lcm(u, v);
                    } catch(ArithmeticException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(u);
        }
    }
}
