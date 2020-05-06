import java.util.Scanner;
/*2036借鉴 每行的开始是一个整数n(3<=n<=100)，它表示多边形的边数（当然也是顶点数），
然后是按照逆时针顺序给出的n个顶点的坐标（x1, y1, x2, y2... xn, yn） 求面积 数学题*/
public class A38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int i;
            if(n==0)
                break;
            else {
                int[] x=new int[100];
                int[] y=new int[100];
                double sum=0;
                for(i=0;i<n;i++){
                    x[i]=sc.nextInt();
                    y[i]=sc.nextInt();
                }
                //S = 0.5 * ( (x0*y1-x1*y0) + (x1*y2-x2*y1) + ... + (xn*y0-x0*yn) )
                for(i=0;i<n-1;i++)
                    sum+=x[i]*y[i+1]-x[i+1]*y[i];
                sum+=x[i]*y[0]-x[0]*y[i];
                System.out.println(sum/2);
            }
        }
    }
}
