import java.math.BigDecimal;
import java.util.Scanner;

public class A92 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum1=0;
        while (sc.hasNextLine()){
            String s=sc.nextLine();
            String[] str=s.split("\\s+");
            if (s.length()==0)break;
            double a=Double.parseDouble(str[1]);
            double b=Double.parseDouble(str[2]);
            double sum=a*b;
            BigDecimal bg=new BigDecimal(sum);
            sum1+=bg.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
        }
        System.out.println(sum1);
    }
}
