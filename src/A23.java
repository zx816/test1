import java.util.Scanner;
/*2021pass 最少需要准备多少张人民币，才能在给每位老师发工资的时候都不用老师找零呢
 人民币一共有100元、50元、10元、5元、2元和1元六种 硬解*/
public class A23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int x=sc.nextInt();
            if (x!=0){
                int a=0;
                for (int i=0;i<x;i++){
                    int m=sc.nextInt();
                    if (m>=100){
                        a=a+m/100;
                        m=m%100;
                    }
                    if (m>=50&&m<100){
                        a=a+m/50;
                        m=m%50;
                    }
                    if (m>=10&&m<50){
                        a=a+m/10;
                        m=m%10;
                    }
                    if (m>=5&&m<10){
                        a=a+m/5;
                        m=m%5;
                    }
                    if (m>=2&&m<5){
                        a=a+m/2;
                        m=m%2;
                    }
                    if (m==2)
                        a=a+1;
                    if (m==1)
                        a=a+1;
                }
                System.out.println(a);
            }else
                break;
        }
    }
}
