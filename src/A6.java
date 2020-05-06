import java.util.Scanner;
/*2004pass 成绩转换 简单题*/
public class A6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        while (sc.hasNext()){
            x=sc.nextInt();
            if (x>=90&&x<=100)
                System.out.println("A");
            else if (x>=80&&x<=89)
                System.out.println("B");
            else if (x>=70&&x<=79)
                System.out.println("C");
            else if (x>=60&&x<=69)
                System.out.println("D");
            else if (x>=0&&x<=59)
                System.out.println("E");
            else
                System.out.println("Score is error!");
        }
    }
}
