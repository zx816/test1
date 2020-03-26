import java.util.Scanner;
/*2032pass*/
public class A34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        while (sc.hasNextInt()){
            x=sc.nextInt();
            int[][] a=new int[x][x];
            for (int i=0;i<x;i++){
                for (int j=0;j<=i;j++) {
                    if (i==0)
                        a[i][j]=1;
                    else if (i==1)
                        a[i][j]=1;
                    else{
                        if (j==0)
                            a[i][j]=1;
                        else if (j==i)
                            a[i][j]=1;
                        else
                            a[i][j]=a[i-1][j-1]+a[i-1][j];
                    }
                }
            }
            for (int i=0;i<x;i++) {
                System.out.print(a[i][0]);
                for (int j = 1; j <= i; j++)
                    System.out.print(" "+a[i][j]);
                System.out.println();
            }
            System.out.println();
        }
    }
}
