import java.util.Scanner;
/*2014pass*/
public class A16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int x=sc.nextInt();
            int[] a=new int[x];
            for (int i=0;i<x;i++)
                a[i]=sc.nextInt();
            for (int j=0;j<a.length-1;j++){
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            for (int k=0;k<a.length-2;k++){
                if (a[k]<a[k+1]){
                    int temp=a[k];
                    a[k]=a[k+1];
                    a[k+1]=temp;
                }
            }
            double sum=0;
            for (int b=0;b<a.length-2;b++)
                sum=sum+a[b];
            System.out.println(String.format("%.2f",sum/(a.length-2)));
        }
    }
}
