import java.util.Scanner;
/*2050pass n条折线分割平面的最大数目 数学问题*/
public class A52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                int m=sc.nextInt();
                System.out.println(2*m*m-m+1);
            }
        }
    }
}
