import java.util.Scanner;
/*2037借鉴*/
public class A39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            if (n==0)
                break;
            else {
                int count=1;
                int[] a=new int[n];
                int[] b=new int[n];
                for (int i=0;i<n;i++){
                    a[i]=sc.nextInt();
                    b[i]=sc.nextInt();
                }
                for(int i=0;i<n;i++)
                {
                    for(int j=i;j<n;j++)
                    {
                        if(b[i]>b[j])
                        {
                            int team=a[i];
                            a[i]=a[j];
                            a[j]=team;
                            team=b[i];
                            b[i]=b[j];
                            b[j]=team;
                        }
                    }
                }
                int aa=a[0];
                int bb=b[0];
                for(int i=1;i<n;i++)
                {
                    if(a[i]>=bb)
                    {
                        count++;
                        bb=b[i];
                    }
                }
                System.out.println(count);
            }
        }
    }
}
