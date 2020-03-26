import java.util.Scanner;
/*2055pass*/
public class A57 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                String s=sc.next();
                int m=sc.nextInt();
                char c=s.charAt(0);
                System.out.println(m+f(c));
            }
        }
    }
    public static int f(char c){
        if (c>=65&&c<=90)
            return c-64;
        else if (c>=97&&c<=122)
            return -(c-96);
        else
            return 0;
    }
}
