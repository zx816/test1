import java.util.Scanner;
/*2044学习 蜜蜂从蜂房a爬到蜂房b的可能路线数。
 所以在第n格里蜜蜂可以爬到第n+1, n+2格子里*/
public class A46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //此处不同
        long ab[]=new long[51];
        ab[0]=1;ab[1]=1;ab[2]=2;
        for(int i=3;i<51;i++)
            ab[i]=ab[i-1]+ab[i-2];
        while (sc.hasNext()){
            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(ab[b-a]);
            }
        }
    }
}
