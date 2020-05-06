import java.util.Scanner;
/*2029pass 回文串 特殊的字符串*/
public class A31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int x=sc.nextInt();
            sc.nextLine();
            for (int i=0;i<x;i++){
                String s=sc.nextLine();
                char[] cs=s.toCharArray();
                int k=0;
                for (int j=0;j<cs.length/2;j++){
                    if (cs[j]!=cs[cs.length-j-1]){
                        System.out.println("no");
                        break;
                    }
                    else
                        k++;
                }
                if (k==cs.length/2)
                    System.out.println("yes");
            }
        }
    }
}
