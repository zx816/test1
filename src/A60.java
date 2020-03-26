import java.util.Scanner;
/*2058study*/
public class A60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int m=sc.nextInt();
            int n=sc.nextInt();
            if (m==0&&n==0)
                break;
            else {
                int len = (int) Math.sqrt(n * 2.0);
                int temp;
                for (int i=len;i>=1;--i){
                    temp = n - (i * i - i) / 2;
                    if (temp % i == 0)
                        System.out.println("[" + (temp / i) + "," + (temp / i + i - 1) + "]");
                }
                System.out.println();
            }
        }
    }
}
