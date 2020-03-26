import java.util.Scanner;
/*2067pass*/
public class A69{
    private static Scanner scanner;
    private static long arr[];
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int count = 1;
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if(n == -1)
                break;
            arr = new long[36];
            arr[0] = 1;
            founction2();// 方法2--递推
            founction1();//方法1--公式（溢出）
            System.out.println(count+" "+n+" "+arr[n] * 2);
            count++;
        }
    }
    public static void founction2() {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++)
                arr[i] += arr[j] * arr[i - j - 1];
        }
    }
    public static void founction1(){
        for (int i = 1; i < arr.length; i++)
            arr[i] = (fac(i*2))/(fac(i+1)*fac(i));
    }
    public static long fac(int n) {
        long sum = 1;
        for (int i = 1; i <= n; i++)
            sum *= i;
        return sum;
    }
}
