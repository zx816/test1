import java.util.Scanner;
/*2033pass 两个时间，A和B 相加 数学题*/
public class A35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int x=sc.nextInt();
            for (int i=0;i<x;i++){
                int ah,am,as,bh,bm,bs;
                ah=sc.nextInt();
                am=sc.nextInt();
                as=sc.nextInt();
                bh=sc.nextInt();
                bm=sc.nextInt();
                bs=sc.nextInt();
                int[] c=new int[3];
                if (as+bs>=60){
                    c[2]=as+bs-60;
                    if (am+bm+1>=60){
                        c[1]=am+bm+1-60;
                        c[0]=ah+bh+1;
                    }else {
                        c[1]=am+bm+1;
                        c[0]=ah+bh;
                    }
                }else {
                    c[2]=as+bs;
                    if (am+bm>=60){
                        c[1]=am+bm-60;
                        c[0]=ah+bh+1;
                    }else {
                        c[1]=am+bm;
                        c[0]=ah+bh;
                    }
                }
                System.out.print(c[0]+" "+c[1]+" "+c[2]);
                System.out.println();
            }
        }
    }
}
