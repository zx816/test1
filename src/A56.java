import java.math.BigDecimal;
import java.util.Scanner;
/*2054需注意*/
public class A56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            BigDecimal a,b;
            a=sc.nextBigDecimal();
            b=sc.nextBigDecimal();
            if(a.compareTo(b)==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
