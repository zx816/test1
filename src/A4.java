import java.text.DecimalFormat;
import java.util.Scanner;
/*2002通过*/
public class A4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.000");
        double x;
        double PI=3.1415927;
        while (sc.hasNextDouble()){
            x=sc.nextDouble();
            System.out.println(df.format(4.0/3.0*PI*Math.pow(x,3)));
        }
    }
}
