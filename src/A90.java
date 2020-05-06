import java.util.Scanner;
/*2088pass 移动箱子的最小数目
  只要求个平均值就可以了。再算出大于平均值的数是多少。*/
public class A90 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            if (n==0)break;
            int[] hi=new int[n+1];
            int sum=0;
            for (int i=1;i<=n;i++) {
                hi[i] = sc.nextInt();
                sum+=hi[i];
            }
            sum=sum/n;
            int count=0;
            for (int i=1;i<=n;i++){
                if (hi[i]>sum)
                    count+=(hi[i]-sum);
            }
            System.out.println(count);
        }
    }
}
