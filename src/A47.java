import java.util.Scanner;
/*2045pass*/
public class A47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long ab[]=new long[60];
        ab[1]=3;ab[2]=6;ab[3]=6;
        for(int i=4;i<60;i++)
            ab[i]=ab[i-1]+ab[i-2]*2;
        while (sc.hasNext()){
            int a=sc.nextInt();
            System.out.println(ab[a]);
        }
    }
}
