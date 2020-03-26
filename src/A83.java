import java.util.Scanner;
/*2081pass*/
public class A83 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int N=sc.nextInt();
            while (N-->0){
                String s=sc.next();
                s=s.substring(6,11);
                System.out.println("6"+s);
            }
        }
    }
}
