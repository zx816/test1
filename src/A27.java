import java.util.Scanner;
/*2025借鉴 对于输入的每个字符串，查找其中的最大字母，在该字母后面插入字符串“(max)”。*/
public class A27{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String s = in.next();
            //用整型数存储最大字符的ascii
            int max =1;
            char[]c = s.toCharArray();
            if (c.length<100) {
                for(int i = 0;i<c.length;i++) {
                    if (c[i]>max)
                        max = c[i];
                }
                for(int i = 0;i<c.length;i++) {
                    System.out.print(c[i]);
                    if ((int)c[i]==max)
                        System.out.print("(max)");
                    if (i==c.length-1)
                        System.out.println();
                }
            }
        }
    }
}
