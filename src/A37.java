import java.util.Scanner;
/*2035pass*/
public class A37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int a=1;
            if (m==0&&n==0)break;
            for (int i=0;i<n;i++)
                //此处不同
                a=a*m%1000;
            System.out.println(a);
        }
    }
}
