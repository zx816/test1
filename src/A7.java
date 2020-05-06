import java.util.Scanner;
/*2005pass不知道自己代码哪有问题
  给定一个日期，输出这个日期是该年的第几天。数学题*/
public class A7 {

    public static boolean ifleapYear(int year) {
        if ((year%4==0 && year%100!=0) ||year%400 == 0){
            return true;
        }
        return false;
    }
    public static int sumab(int a,int b) {
        a-=1;b-=1;
        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        for(int i= a;i<=b;i++) {
            sum+=month[i];
        }
        return sum;
    }
    public static int countDays(int y,int m,int d) {
        boolean leapYear = ifleapYear(y);
        boolean overTwo = (m-1)>=2;
        if (leapYear && overTwo) {
            return sumab(1,m-1)+d+1;
        }
        return sumab(1,m-1)+d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] data = str.split("/");
            int y = Integer.parseInt(data[0]);
            int m = Integer.parseInt(data[1]);
            int d = Integer.parseInt(data[2]);
            System.out.println(countDays(y,m,d));
        }
    }
}

