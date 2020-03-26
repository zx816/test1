import java.util.Scanner;
/*2071pass*/
public class A73 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            while (n-->0){
                int m=sc.nextInt();
                Double[] a=new Double[m];
                for (int i=0;i<m;i++)
                    a[i]=sc.nextDouble();
                double temp=a[0];
                for (int i=1;i<m;i++){
                    if (a[i]>temp)
                        temp=a[i];
                }
                System.out.println(String.format("%.2f", temp));
            }
        }
    }
}
