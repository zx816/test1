import java.util.Scanner;
/*2008pass 数值统计 简单题*/
public class A10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,b,c,d;
        double a;
        while (sc.hasNext()){
            b=0;c=0;d=0;
            x=sc.nextInt();
            if (x!=0){
                for (int i=0;i<x;i++){
                    //注意题目中是实数还是整数
                    a=sc.nextDouble();
                    if (a>0)
                        b++;
                    else if (a<0)
                        d++;
                    else
                        c++;
                }
                System.out.println(d+" "+c+" "+b);
            }else
                break;
        }
    }
}
