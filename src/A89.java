import java.util.Scanner;
/*字符串匹配*/
public class A89 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s1=sc.next();
            //此处注意
            if ("#".equals(s1))break;
            String s2=sc.next();
            int index=s1.indexOf(s2,0);
            int a=0;
            while (index>=0){
                a++;
                index=s1.indexOf(s2,index+s2.length());
            }
            System.out.println(a);
        }
    }
}
