import java.util.Scanner;
/*2036借鉴*/
public class A38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int i;
            if(n==0)
                break;
            else {
                int[] x=new int[100];
                int[] y=new int[100];
                double sum=0;
                for(i=0;i<n;i++){
                    x[i]=sc.nextInt();
                    y[i]=sc.nextInt();
                }
                for(i=0;i<n-1;i++)
                    sum+=x[i]*y[i+1]-x[i+1]*y[i];
                sum+=x[i]*y[0]-x[0]*y[i];
                System.out.println(sum/2);
            }
        }
    }
}
