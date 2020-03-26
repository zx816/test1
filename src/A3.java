import java.text.DecimalFormat;
import java.util.Scanner;
/*2001通过*/
public class A3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x1,y1,x2,y2;
        while (sc.hasNextDouble()){
            x1=sc.nextDouble();
            y1=sc.nextDouble();
            x2=sc.nextDouble();
            y2=sc.nextDouble();
            DecimalFormat df=new DecimalFormat("#.00");
            System.out.println(df.format(Math.pow(Math.pow(x1-x2,2)+Math.pow(y1-y2,2),0.5)));
        }
    }
}
