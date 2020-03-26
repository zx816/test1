import java.util.Scanner;
/*2077study*/
public class A79 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] aa=new int[21];
        aa[1]=1;
        for (int i=2;i<=20;i++)
            aa[i]=3*aa[i-1]+1;
        while (sc.hasNextInt()){
            int n=sc.nextInt();
            while (n-->0){
                int m=sc.nextInt();
                if (m==1)
                    System.out.println(2);
                else
                    System.out.println(2*aa[m-1]+2);
            }
        }
    }
}
