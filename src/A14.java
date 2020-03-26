import java.util.Scanner;
/*2012pass*/
public class A14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        while (sc.hasNext()){
            m=sc.nextInt();
            n=sc.nextInt();
            int a=0;
            if (m>=-39&&m<=n&&n<=50) {
                if (m == 0 && n == 0)
                    break;
                else {
                    boolean f = true;
                    for (int i = m; i <= n; i++) {
                        //这个位置有误
                        a = i * i + i + 41;
                        if (!f(a)) {
                            f = false;
                            break;
                        }
                    }
                    if (f)
                        System.out.println("OK");
                    else
                        System.out.println("Sorry");
                }
            }
        }
    }
    public static boolean f(int a){
        boolean flag=true;
        if (a<2)
            return false;
        else {
            for (int i=2;i*i<=a;i++){
                if (a%i==0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
