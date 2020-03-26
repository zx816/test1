import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/*2062study*/
public class A64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            long m=sc.nextLong();
            List list=new LinkedList();
            List list1=new ArrayList();
            long num[]=new long[21];
            num[1]=1;
            num[2]=2;
            for(int i = 3; i<n+1; i++)
                num[i]=num[i-1]*(i-1)+1;
            list.add(0);
            for(int i = 1; i<=n; i++)
                list.add(i);
            for(int i = n; i>0; i--){
                if(m%num[i]==0){
                    list1.add(list.get((int) (m/num[i])));
                    list.remove(list.get((int) (m/num[i])));
                    m=num[i]-1;
                }
                else {
                    list1.add(list.get((int) (m/num[i])+1));
                    list.remove(list.get((int) (m/num[i])+1));
                    m=m%num[i]-1;
                    if(m==0)break;
                }
            }
            for(int i=0;i<list1.size();i++){
                if(i==0)System.out.print(list1.get(i));
                else System.out.print(" "+list1.get(i));
            }
            System.out.println();
        }
    }
}
