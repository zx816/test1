import java.util.Scanner;
/*2074study*/
public class A76 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;int k = 0;
        while(cin.hasNext()) {
            char map[][]= new char[100][100];
            n =cin.nextInt();
            char out =cin.next().charAt(0);
            char in = cin.next().charAt(0);
            char last;
            if(k!=0)
                System.out.println();
            k++;
            int w= 0,m = n;
            int lay = (n+1)/2%2;
            if(lay==0)
                last =in;
            else
                last =out;
            while(m-w!=-1) {
                for(int i = w;i <m;i++) {
                    for(int j = w;j <m;j++) {
                        if((i==0&&j==0)||(i==n-1&&j==n-1)||(i==0&&j==n-1)||(i==n-1&&j==0))
                            map[i][j]=' ';
                        else
                            map[i][j]=last;
                    }
                }
                if(last==out)
                    last=in;
                else
                    last=out;
                w++;
                m--;
            }
            if(n==1)
                System.out.println(out);
            else {
                for(int  ss = 0 ;  ss <n;ss++) {
                    for(int tt= 0; tt<n;tt++)
                        System.out.print(map[ss][tt]);
                    System.out.println();
                }
            }
        }
    }
}





