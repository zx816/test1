import java.util.Scanner;
/*2099简单题按题意*/
public class A101 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if (a==0&&b==0)break;
            int count=0;
            for (int i=0;i<=99;i++){
                int c=a*100;
                if ((c+=i)%b==0){
                    count++;
                    if (count==1) {
                        if (i >= 0 && i <= 9)
                            System.out.print("0" + i);
                        else
                            System.out.print(i);
                    }else {
                        if (i >= 0 && i <= 9)
                            System.out.print(" 0" + i);
                        else
                            System.out.print(" "+i);
                    }
                }
            }
            System.out.println();
        }
    }
}
