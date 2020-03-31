import java.util.Scanner;
/*2003pass*/
public class A5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x;
        while (sc.hasNext()){
            x=sc.nextDouble();
            System.out.println(String.format("%.2f",Math.abs(x)));
        }
    }
}
