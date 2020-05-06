import java.util.Scanner;
/*2051pass 2031的特殊
十进制和二进制的转换*/
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
