import java.util.Scanner;
/*2056学习 给出两个矩形在对角线上的顶点的坐标，要求你计算两个矩形的公共部分的面积。
其实，说的极端一点，两矩形摆放，也就两种摆法：相交与不相交。*/
public class A58 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        while (sn.hasNext()) {
            double a1 = sn.nextDouble();
            double b1 = sn.nextDouble();
            double a2 = sn.nextDouble();
            double b2 = sn.nextDouble();
            double c1 = sn.nextDouble();
            double d1 = sn.nextDouble();
            double c2 = sn.nextDouble();
            double d2 = sn.nextDouble();
            double k, a, b, c, d;
            if (a1 > a2) {
                k = a1;
                a1 = a2;
                a2 = k;
            }
            if (b1 > b2) {
                k = b1;
                b1 = b2;
                b2 = k;
            }
            if (c1 > c2) {
                k = c1;
                c1 = c2;
                c2 = k;
            }
            if (d1 > d2) {
                k = d1;
                d1 = d2;
                d2 = k;
            }
            // 在x方向的比较
            // 在y反向的比较
            if (a1 > c2 || a2 < c1 || b1 > d2 || b2 < d1) // 判断是否相离
                System.out.println("0.00");
            else { // 两个矩形有相交部分
                 if (a1 <= c1)
                     a = c1;
                 else
            		 a = a1;
                 if (a2 <= c2)
                     b = a2;
                 else
            	      b = c2;
                 if (b1 <= d1)
              	       c = d1;
                 else
            	      c = b1;
                 if (b2 <= d2)
            	      d = b2;
                 else
            	      d = d2;
            	  System.out.println(String.format("%.2f", (b - a) * (d - c)));
            }
        }
    }
}
