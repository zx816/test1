import java.util.Scanner;
/*2091pass 输出图形*/
public class A93 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            char c=sc.next().charAt(0);
            if (c=='@')break;
            int n=sc.nextInt();
            for (int i=1;i<=n;i++){
                if (i==1){
                    for (int j=1;j<n;j++)
                        System.out.print(" ");
                    System.out.println(c);
                }
                else if (i!=1&&i!=n){
                    for (int j=1;j<n-i+1;j++)
                        System.out.print(" ");
                    System.out.print(c);
                    for (int j=1;j<=2*(i-1)-1;j++)
                        System.out.print(" ");
                    System.out.println(c);
                }
                else {
                    for (int j=1;j<=2*(n-1)+1;j++)
                        System.out.print(c);
                    System.out.println();
                }
            }
        }
    }
}
