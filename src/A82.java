import java.util.Scanner;
/*2080pass*/
public class A82 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double PI=3.1415927;
        while (sc.hasNext()){
            int T=sc.nextInt();
            while (T-->0){
                double x1=sc.nextDouble();
                double y1=sc.nextDouble();
                double x2=sc.nextDouble();
                double y2=sc.nextDouble();
                //向量夹角公式 cosφ=A1A2+B1B2/[√(A1^2+B1^2)*√(A2^2+B2^2)]
                //角度=180°×弧度÷π
                double m=x1*x2+y1*y2;
                double t=Math.pow(x1*x1+y1*y1,0.5)*Math.pow(x2*x2+y2*y2,0.5);
                System.out.println(String.format("%.2f",Math.acos(m/t)/PI*180));
            }
        }
    }
}
