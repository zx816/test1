import java.util.Scanner;
/*2075pass*/
public class A77 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            while (n-->0){
                int a=sc.nextInt();
                int b=sc.nextInt();
                if(a%b==0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
