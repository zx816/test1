import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
/*2034借鉴*/
public class A36 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        while(scan.hasNext()){
            int n=scan.nextInt();
            int m=scan.nextInt();
            if(n==0&&m==0)break;
            List<Integer> a=new ArrayList<Integer>();
            List<Integer> b=new ArrayList<Integer>();
            for(int i=1;i<=n;i++){
                int s=scan.nextInt();
                a.add(s);
            }
            for(int i=1;i<=m;i++){
                int s=scan.nextInt();
                b.add(s);
            }
            a.removeAll(b);
            Collections.sort(a);
            if(a.isEmpty())
                System.out.println("NULL");
            else {
                for(int i=0;i<a.size();i++)
                     System.out.print(a.get(i)+" ");
                System.out.println();
            }
        }
    }
}

