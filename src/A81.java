import java.util.Scanner;
/*2079pass 硬解*/
public class A81 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,s,k;
        int[] t=new int[9];
        int[] c=new int[9];
        while (sc.hasNext()){
            int T=sc.nextInt();
            while (T-->0){
                //共需要修n学分
                n=sc.nextInt();
                //k种科目
                k=sc.nextInt();
                //组合数
                s=0;
                for (int i=0;i<9;t[i++]=0);
                for (int j=0;j<k;j++){
                    int h=sc.nextInt();
                    t[h]=sc.nextInt();
                }
                for (c[8] = 0; c[8] <= t[8] && c[8] * 8 <= n; c[8]++)
                    for (c[7] = 0; c[7] <= t[7] && c[8] * 8 + c[7] * 7 <= n; c[7]++)
                        for (c[6] = 0; c[6] <= t[6] && c[8] * 8 + c[7] * 7 + c[6] * 6 <= n; c[6]++)
                            for (c[5] = 0; c[5] <= t[5] && c[8] * 8 + c[7] * 7 + c[6] * 6 + c[5] * 5 <= n; c[5]++)
                                for (c[4] = 0; c[4] <= t[4] && c[8] * 8 + c[7] * 7 + c[6] * 6 + c[5] * 5  + c[4] * 4 <= n; c[4]++)
                                    for (c[3] = 0; c[3] <= t[3] && c[8] * 8 + c[7] * 7 + c[6] * 6 + c[5] * 5  + c[4] * 4  + c[3] * 3 <= n; c[3]++)
                                        for (c[2] = 0; c[2] <= t[2] && c[8] * 8 + c[7] * 7 + c[6] * 6 + c[5] * 5  + c[4] * 4  + c[3] * 3  + c[2] * 2 <= n; c[2]++) {
                                            c[1] = n - (c[8] * 8 + c[7] * 7 + c[6] * 6 + c[5] * 5  + c[4] * 4  + c[3] * 3  + c[2] * 2);
                                            if (c[1] >= 0 && c[1] <= t[1]) s++;
                                        }
                System.out.println(s);
            }
        }
    }
}
