import java.util.Scanner;
/*2007pass 给定一段连续的整数，求出他们中所有偶数的平方和以及所有奇数的立方和。简单题*/
public class A9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        while (sc.hasNext()){
            m=sc.nextInt();
            n=sc.nextInt();
            int a=0;
            int b=0;
            //这段别漏，题目未指定m，n的大小
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
