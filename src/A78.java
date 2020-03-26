import java.util.Scanner;
/*2076study*/
public class A78 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            while (n-->0){
                int h=sc.nextInt();
                int m=sc.nextInt();
                int s=sc.nextInt();
                h%=12;
                double tm=s/10.0+m*6.0;
                double th=h*30.0+tm/12.0;
                double res=Math.abs(th-tm);
                if(res>360-res)
                    res=360-res;
                System.out.println((int)res);
            }
        }
    }
}
