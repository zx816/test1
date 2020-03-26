import java.util.Scanner;
/*2051pass*/
public class A53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int num = input.nextInt();
            String a = "";
            while(num!=0) {
                a=num%2+a;
                num=num/2;
            }
            System.out.println(a);
        }
    }
}
