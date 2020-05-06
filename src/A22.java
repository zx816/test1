import java.util.Scanner;
/*2020pass注意冒泡排序 绝对值排序*/
public class A22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int m=sc.nextInt();
            if (m!=0){
                int[] a=new int[m];
                for (int i=0;i<m;i++)
                    a[i]=sc.nextInt();
                //冒泡排序,每一轮确定一个最小值或最大值
                for (int j=0;j<m-1;j++){
                    for (int k=0;k<m-j-1;k++) {
                        if (Math.abs(a[k]) < Math.abs(a[k + 1])) {
                            int temp = a[k];
                            a[k] = a[k + 1];
                            a[k + 1] = temp;
                        }
                    }
                }
                System.out.print(a[0]);
                for (int i=1;i<m;i++)
                    System.out.print(" "+a[i]);
                System.out.println();
            }else
                break;
        }
    }
}
