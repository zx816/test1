import java.util.Scanner;
/*2017pass 字符串统计 简单题*/
public class A19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        while (x--!=0){
            String s=sc.next();
            char[] chars=s.toCharArray();
            int k=0;
            for (char c:chars){
                //统计数字字符出现的次数
                if (c>='0'&&c<='9')
                    k++;
            }
            System.out.println(k);
        }
    }
}
