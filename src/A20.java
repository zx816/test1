import java.util.Scanner;
/*2018pass 递归是否会分析 有一头母牛，它每年年初生一头小母牛。每头小母牛从第四个年头
开始，每年年初也生一头小母牛 第n年的牛的来源有2中:
第n-1年的牛 ；第n-3年的牛所生的小牛
*/
public class A20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[55];
        a[1]=1;a[2]=2;a[3]=3;
        for (int i=4;i<55;i++)
            a[i]=a[i-1]+a[i-3];
        while (sc.hasNext()){
            int x=sc.nextInt();
            if (x!=0){
                System.out.println(a[x]);
            }else
                break;
        }
    }
}
