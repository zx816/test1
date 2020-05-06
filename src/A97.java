import java.util.Scanner;
/*用哈希记录所有出现过的数字的个数，最后出现一次的就是结果
 超时问题*/
public class A97 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            if (n==0)break;
            int ans=0;
            while (n-->0)
                ans=ans^sc.nextInt();
            System.out.println(ans);
        }
    }
}
