import java.util.Scanner;
/*2053be smart*/
public class A55 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int[] a=new int[n+1];
            for (int j=1;j<n+1;j++) {
                if (n%j==0) {
                    if (a[n]==0)
                        a[n]=1;
                    else if (a[n]==1)
                        a[n]=0;
                }
            }
            System.out.println(a[n]);
        }
    }
}
