import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
/*2031pass*/
public class A33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        while (sc.hasNextInt()){
            m=sc.nextInt();
            n=sc.nextInt();
            if (n>=2&&n<=16&&n!=10){
                if(m==0)
                    System.out.println(0);
                else if (m>0)
                     System.out.println(f(m,n));
                else
                    System.out.println("-"+f(m,n));
            }
        }
    }
    public static String f(int m,int n){
        if (m<0)
            m=-m;
        Deque<Integer> deque=new LinkedList<Integer>();
        while (m!=0){
            deque.push(m%n);
            m=m/n;
        }
        String s="";
        while (!deque.isEmpty()){
            s+=q(deque.pop());
        }
        return s;
    }
    public static String q(int a){
        if (a<10)
            return String.valueOf(a);
        else if (a>=10){
            switch (a){
                case 10:
                    return "A";
                case 11:
                    return "B";
                case 12:
                    return "C";
                case 13:
                    return "D";
                case 14:
                    return "E";
                case 15:
                    return "F";
            }
        }
        return null;
    }
}
