import java.util.Scanner;
/*2069study*/
public class A71 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a,b,c,d,e,n;
        int[]s=new int[251];
        for(n=0;n<=250;n++)
            for(e=0;50*e<=n;e++)
                for(d=0;25*d<=n-50*e;d++)
                    for(c=0;10*c<=n-50*e-25*d;c++)
                        for(b=0;5*b<=n-50*e-25*d-10*c;b++){
                            a=n-50*e-25*d-10*c-5*b;
                            if(a+b+c+d+e<=100)
                                s[n]++;
                         }
        while(sc.hasNext()){
            int m=sc.nextInt();
            System.out.println(s[m]);
        }
    }
}
