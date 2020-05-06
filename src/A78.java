import java.util.Scanner;
/*2076study*/
public class A78 {
    /*我们知道，时针走30°/小时，分针走6°/分钟。
      所有
      时针走:30°/h = 0.5°/m = (1/120)°/s
      分针走: 6°/m = 0.1°/s
      所有在h:m:s时，时针的角度为30*h + m/2 + s/120;分针的角度为:6*m + s/10;
      所有它们的夹角为fabs(30*h + m/2 + s/120 - 6*m - s/10) = fabs(30*h - 11*m/2 - 11*s/120)
      当然，这是在12小时制下(而不是24小时)。 */
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
