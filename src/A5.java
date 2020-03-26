import java.text.DecimalFormat;
import java.util.Scanner;
/*2003pass*/
public class A5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.00");
        double x;
        while (sc.hasNextDouble()){
            x=sc.nextDouble();
            System.out.println(df.format(Math.abs(x)));
        }
    }
}
