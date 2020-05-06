import java.util.Scanner;
/*2047pass 长度为n的只由"E" "O" "F"三种字符组成的字符串（可以只有其中一种或两种字符，
但绝对不能有其他字符）,阿牛同时禁止在串中出现O相邻的情况*/
public class A49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long[] num=new long[41];
        num[0]=0;num[1]=3;num[2]=8;
        /*1.最后一位不是‘o’时：
         对前n-1个字符没有要求（前者自然符合无“o-o”对的要求），最后一个字符
         有两种选择，则共有 : 2*M(n-1)
         2.最后一位是‘o’时：
         第n-1个字符不能是‘o’，则有2*M(n-2)
         共计： 2*[M(n-1)+M(n-2)]种。 */
        for(int i=3;i<41;i++)
            num[i]=2*(num[i-1]+num[i-2]);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(num[n]);
        }
    }
}
