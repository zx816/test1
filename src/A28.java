import java.util.Scanner;
/*2026借鉴 首字母变大写*/
public class A28{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String s = in.nextLine();
            char [] ch = s.toCharArray();
            //小写变大写
            ch[0] = (char) (ch[0]-32);
            for(int i = 0;i<ch.length;i++){
                if (ch[i]==' ')
                    ch[i+1]=Character.toUpperCase(ch[i+1]);
            }
            for(int i = 0;i<ch.length;i++)
                System.out.print(ch[i]);
            System.out.println();
        }
    }
}

