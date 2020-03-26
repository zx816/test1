import java.util.Scanner;
/*2007pass*/
public class A9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        while (sc.hasNextInt()){
            m=sc.nextInt();
            n=sc.nextInt();
            int a=0;
            int b=0;
            if (m>n){
                int temp=m;
                m=n;
                n=temp;
            }
            for (int i=m;i<=n;i++){
                if (i%2==0)
                    a=a+i*i;
                else
                    b=b+i*i*i;
            }
            System.out.println(a+" "+b);
        }
    }
}
