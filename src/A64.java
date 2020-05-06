import java.util.Scanner;
/*2062study 考虑一个集合 An = { 1, 2, ..., n}。比如，A1={1}，A3={1,2,3}。
我们称一个非空子集元素的排列为一个子集序列。对所有的子序列按字
典顺序排序。你的任务就是给出第m个子序列。不难发现，An可以按首数字分成n组，
而每组里除了第一项，剩下的就是An-1的子集合了。 ∴f(n) = n[f(n-1) + 1] ，f(1) = 1
我们拿测试数据3 10来做个示范，解释一下怎么求解。
 
因为n=3，所以开始数组里1、2、3三个数。 
n=3可以分成三组，每组5个(加上空集)。 
因此第10个在第二组里。所以第一个是2，把2输出。
然后10 - (2 - 1) * 5 = 5，即它在第2组的第5个。 
减去首个空集合，5 - 1 = 4 ≠ 0，表示2后面还有数字。 
因为A1 = 1是，所以再第2组里又可以分成两组，每组2个(加上空集)。 
所以，4在第2组，剩下的数组中，第二个元素是3，所以输出3。
再把数组里的3删除，剩下1一个数。 
然后4 - (2 - 1) * 2 = 2，既它是第2组的第2个。 
减去首个空集，2 - 1 = 1 ≠ 0，表示2后面还有数字。 

按上面的方法继续下去，直到n = 0 或 后面为空集为止。 
最后输出数组里的第1个元素，就得到2 3 1，就是解了。 
从上面的计算可以看出来，本题目的关键是先求的An中每一组的个数g(n) 
不难得出:g(n) = f(n) / n 
∵f(n) = n[f(n-1) + 1] 
∴g(n) = n[f(n-1) + 1] / n = f(n-1) + 1 
∵f(n-1) = (n-1) * g(n-1) 
∴g(n) = (n-1) * g(n-1) + 1*/
//没通过
public class A64 {
    public static void main(String[] args) {
        int[] len=new int[22];
        int[] a=new int[22];
        len[1]=1;
        //由题意，每组的长度是多少
        for (int i=2;i<21;i++)
            len[i]=(i-1)*len[i-1]+1;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            long m=sc.nextLong();
            // 刚开始时每个i的对应位置都为i  随着i被取走，i位置后的值需要往前移
            for (int i=1;i<21;i++)
                a[i]=i;
            while (m!=0){
                int k=(int)((m-1)/len[n]+1);
                System.out.print(a[k]);
                for(int j = k; j < 21; j++)
                    a[j] = a[j+1];
                m %= len[n];
                if(m == 0)
                    m = len[n];
                m--;
                n--;
                if(m!=0)
                    System.out.print(" ");
                else
                    System.out.println();
            }
        }
    }
}
