import java.util.Scanner;
/*2018pass递归*/
public class A20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            int x=sc.nextInt();
            if (x!=0){
                System.out.println(f(x));
            }else
                break;
        }
    }
    public static int f(int a){
        if (a==1)
            return 1;
        else if (a==2)
            return 2;
        else if (a==3)
            return 3;
        else
            return f(a-1)+f(a-3);
    }
}
