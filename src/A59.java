import java.util.Scanner;

public class A59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            //radix基底
            long i=Long.parseLong(sc.next().replaceAll("\\+",""),16)+Long.parseLong(sc.next().replaceAll("\\+",""),16);
            if(i<0)
                System.out.println("-"+Long.toHexString(-i).toUpperCase());
            else
                System.out.println(Long.toHexString(i).toUpperCase());
        }
    }
}
