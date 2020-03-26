import java.util.Scanner;
/*2006pass*/
public class A8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        while (sc.hasNextInt()){
            x=sc.nextInt();
            int z=1;
            for (int i=0;i<x;i++){
                y=sc.nextInt();
                if (y%2==1)
                    z=z*y;
            }
            System.out.println(z);
        }
    }
}
