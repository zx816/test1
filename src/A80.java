import java.util.Scanner;
/*2078study*/
public class A80 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int T=sc.nextInt();
            while (T-->0){
                int n=sc.nextInt();
                int m=sc.nextInt();
                int[] a=new int[n];
                for (int i=0;i<n;i++)
                    a[i]=sc.nextInt();
                int temp=a[0];
                for (int i=1;i<n;i++){
                    if (a[i]<temp)
                        temp=a[i];
                }
                System.out.println((100-temp)*(100-temp));
            }
        }
    }
}
