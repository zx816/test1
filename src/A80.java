import java.util.Scanner;
/*2078study*/
/*按题目的介绍，如果前一门复习的课程的难度为m，后一门为n。那他复习后一门的效率就为(m-n)*(m-n);
自然，这里的m越大，n越小，它的效率自然就越高！
而m最大值为初始状态100，因此，我们的任务就是求它这么多要复习的课程中，难度最小的一门。即最小的n*/
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
