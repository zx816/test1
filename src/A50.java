import java.util.Scanner;
/*2048pass*/
public class A50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        double[] ls = new double[21];
        ls[0] = 0; ls[1] = 0; ls[2] = 1;
        double[] gq = new double[21];
        gq[0] = 1; gq[1] = 1; gq[2] = 2;
        for(int j=3;j<21;j++) {
            gq[j]=gq[j-1]*j;
            ls[j]=(j-1)*(ls[j-1]+ls[j-2]);
        }
        for(int i = 0;i < a;i++) {
            int n = sc.nextInt();
            System.out.println(String.format("%.2f", (ls[n]/gq[n]*100)) + "%");
        }
    }
}
