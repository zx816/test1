import java.util.Scanner;
/*2047pass*/
public class A49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long[] num=new long[41];
        num[0]=0;
        num[1]=3;
        num[2]=8;
        for(int i=3;i<41;i++)
            num[i]=2*(num[i-1]+num[i-2]);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(num[n]);
        }
    }
}
