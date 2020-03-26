import java.util.Scanner;
/*2043pass*/
public class A45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            sc.nextLine();
            for (int i=0;i<n;i++){
                String s=sc.nextLine();
                int a=s.length();
                char[] cs=s.toCharArray();
                if (a>=8&&a<=16){
                    int[] kind=new int[4];
                    boolean f=true;
                    int count=0;
                    for (int j=0;j<a;j++){
                        if (cs[j]>='A'&&cs[j]<='Z')
                            kind[0]=1;
                        else if (cs[j]>='a'&&cs[j]<='z')
                            kind[1]=1;
                        else if (cs[j]>='0'&&cs[j]<='9')
                            kind[2]=1;
                        else if (cs[j]=='~'||cs[j]=='!'||cs[j]=='@'||cs[j]=='#'||cs[j]=='$'||cs[j]=='%'||cs[j]=='^')
                            kind[3]=1;
                        else {
                            System.out.println("NO");
                            f=false;
                            break;
                        }
                    }
                    if (f){
                        for (int j=0;j<4;j++){
                            if (kind[j]==1)
                                count++;
                        }
                    }
                    if (count>=3)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }else
                    System.out.println("NO");
            }
        }
    }
}
