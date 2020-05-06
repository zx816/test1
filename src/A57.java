import java.util.Scanner;
/*2055pass 我们定义f(A) = 1, f(a) = -1, f(B) = -2, ... f(Z) = -26;
给你一个字母x 以及一个数字y ，要求你输出 y + f(x)的值 也可用hashmap*/
public class A57 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                String s=sc.next();
                int m=sc.nextInt();
                char c=s.charAt(0);
                System.out.println(m+f(c));
            }
        }
    }
    public static int f(char c){
        //(A,Z)
        if (c>=65&&c<=90)
            return c-64;
        //(a,z)
        else if (c>=97&&c<=122)
            return -(c-96);
        else
            return 0;
    }
}
