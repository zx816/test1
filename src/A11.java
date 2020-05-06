import java.util.Scanner;
/*2009pass 求数列的和 数学题*/
public class A11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        while (sc.hasNext()){
            m=sc.nextInt();
            n=sc.nextInt();
            double s=(double)m;
            double t=0;
            for (int i=0;i<n;i++) {
                t=t+s;
                s =Math.pow(s, 0.5);
            }
            System.out.println(String.format("%.2f",t));
        }
    }
}
