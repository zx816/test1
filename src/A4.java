import java.util.Scanner;
/*2002通过*/
public class A4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x;
        double PI=3.1415927;
        while (sc.hasNext()){
            x=sc.nextDouble();
            System.out.println(String.format("%.3f",4.0/3.0*PI*x*x*x));
        }
    }
}
