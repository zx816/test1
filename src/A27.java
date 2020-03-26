import java.util.Scanner;
/*2025pass*/
public class A27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.next();
            char c=s.charAt(0);
            int[] loc=new int[s.length()];
            int k=0;
            loc[0]=0;
            for (int i=1;i<s.length();i++){
                if (s.charAt(i)>=c){
                    if (s.charAt(i)==c)
                        loc[++k]=i;
                    else {
                        c=s.charAt(i);
                        for (int j=0;j<k;j++)
                            loc[j]=0;
                        loc[0]=i;
                        k=0;
                    }
                }
            }
            String s1="";
            char[] cs=s.toCharArray();
            int h=0;
            for (int i=0;i<s.length();i++){
                s1+=cs[i];
                for (int j=h;j<loc.length;j++){
                    if (i==loc[j]) {
                        s1 += "(max)";
                        h++;
                        break;
                    }
                    else
                        break;
                }
            }
            System.out.println(s1);
        }
    }
}
