import java.util.Scanner;
/*2097简单题 按题意判断是否是指定的数*/
public class A99 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
             int n=sc.nextInt();
             if (n==0)break;
             int a1=n/1000;
             int b1=n/100%10;
             int c1=n/10%10;
             int d1=n%10;
             int e1=a1+b1+c1+d1;
             int m=n;
             int k=m;
             int e2=0;
             while (n!=0){
                 e2+=n%12;
                 n=n/12;
             }
             int e3=0;
             while (m!=0){
                 e3+=m%16;
                 m=m/16;
             }
             if (e1==e2&&e2==e3)
                 System.out.println(k+" is a Sky Number.");
             else
                 System.out.println(k+" is not a Sky Number.");
        }
    }
}
