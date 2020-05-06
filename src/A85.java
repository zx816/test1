import java.util.Scanner;
/*2083pass*/
public class A85 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            int s=cin.nextInt();
            while(s-->0){
                int n=cin.nextInt();
                int []a=new int [n];
                int t;
                int m;
                int sum=0;
                for(int i=0;i<n;i++)
                    a[i]=cin.nextInt();
                //从小到大排列
                for(int i=0;i<n-1;i++){
                    for(int j=i+1;j<n;j++){
                        if(a[i]>a[j]){
                            t=a[i];
                            a[i]=a[j];
                            a[j]=t;
                        }
                    }
                }
                m=a[n/2];
                for(int i=0;i<n;i++){
                    sum+=Math.abs(a[i]-m);
                }
                System.out.println(sum);
            }
        }
    }
}