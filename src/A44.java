import java.util.Scanner;
/*2042pass*/
public class A44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                int m=sc.nextInt();
                int sum=3;
                for (int j=0;j<m;j++)
                    sum=2*(sum-1);
                System.out.println(sum);
            }
        }
    }
}
