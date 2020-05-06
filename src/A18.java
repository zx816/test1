import java.util.Scanner;
/*2016pass 输入n(n<100)个数，找出其中最小的数，将它与最前面的数交换后输出这些数 数学题*/
public class A18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int m=sc.nextInt();
            if (m!=0){
                int[] a=new int[m];
                for (int i=0;i<m;i++)
                    a[i]=sc.nextInt();
                int loc=0;
                int temp=a[0];
                for (int j=1;j<m;j++){
                    if (a[j]<temp){
                        temp=a[j];
                        loc=j;
                    }
                }
                if (loc!=0){
                    int c=a[0];
                    a[0]=a[loc];
                    a[loc]=c;
                }
                System.out.print(a[0]);
                for (int k=1;k<m;k++)
                    System.out.print(" "+a[k]);
                System.out.println();
            }else
                break;
        }
    }
}
