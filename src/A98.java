import java.util.Scanner;
/*2096简单题*/
public class A98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println((a%100+b%100)%100);
            }
        }
    }
}
