import java.util.Scanner;
/*2041pass*/
public class A43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                int m=sc.nextInt();
                System.out.println(f(m));
            }
        }
    }
    public static int f(int a){
        if (a==1)
            return 1;
        else if (a==2)
            return 1;
        else
            return f(a-1)+f(a-2);
    }
}
