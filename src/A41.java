import java.util.Scanner;
/*2039pass 给定三条边，请你判断一下能不能组成一个三角形。数学题*/
public class A41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int x=sc.nextInt();
            for (int i=0;i<x;i++){
                double a=sc.nextDouble();
                double b=sc.nextDouble();
                double c=sc.nextDouble();
                if (a+b>c){
                    if (a+c>b){
                        if(b+c>a)
                            System.out.println("YES");
                        else
                            System.out.println("NO");
                    }
                    else
                        System.out.println("NO");
                }
                else
                    System.out.println("NO");
            }
        }
    }
}
