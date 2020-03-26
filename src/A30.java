import java.util.Scanner;
/*2028pass*/
public class A30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int x=sc.nextInt();
            int[] a=new int[x];
            for (int i=0;i<x;i++){
                a[i]=sc.nextInt();
            }
            int temp=a[0];
            for (int i=1;i<x;i++){
                if (a[i]>temp)
                    temp=a[i];
            }
            int k=0;
            for (int i=0;i<x;i++){
                if (temp%a[i]!=0) {
                    i=-1;
                    temp++;
                }
            }
            System.out.println(temp);
        }
    }
}
