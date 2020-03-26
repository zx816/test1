import java.util.Scanner;
/*2060pass*/
public class A62 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                if (a>6)
                    b+=(a-6)*8+27;
                else{
                    //此处
                    b+=a*(15-a)/2;
                }
                if (b>=c)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}
