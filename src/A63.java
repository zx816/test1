import java.util.Scanner;
/*2061学习 计算绩点*/
public class A63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            boolean fail=false;
            int k = sc.nextInt();
            double c [] = new double [k];
            double s [] = new double [k];
            double sum=0;
            double cj=0;
            for(int i=0;i<k;i++){
                String str=sc.next();
                c[i]=sc.nextDouble();
                s[i]=sc.nextDouble();
                sum=sum+c[i];
                cj=cj+s[i]*c[i];
                if(s[i]<60){
                    fail=true;
                }
            }
            if(fail){
                System.out.println("Sorry!");
            }else{
                System.out.println(String.format("%.2f", (1.0*cj)/sum));
            }
            if(n>0){
                System.out.println("");
            }
        }
    }
}
